(ns styles.garden-examples.main
  ;; unless you want to see a bunch of warnings add this line
  (:refer-clojure :exclude [+ - * /])
  (:require [garden.arithmetic :as arithmetics :refer [+ - * /]]
            [garden.color :as color :refer [hsl rgb]]
            [garden.def :refer [defstyles defcssfn]]
            [garden.stylesheet :refer [at-media]]
            [garden.units :refer [px pt]]))

(defcssfn url)

(def img-url (url "images/bunny.jpeg"))

(defcssfn linear-gradient)

(def arithmetics
  [(+ 20 (hsl 0 0 0) 1 (rgb 255 0 0))
   (- 20 (px 1) 5 (pt 5))])

(def reset-text-formatting
  {:font {:weight "normal" :style "normal" :variant "normal"}
   :text {:decoration "none"}})

(defn partially-rounded
  ([r1] (partially-rounded r1 r1))
  ([r1 r2]
     {:border {:top-right-radius r1
               :bottom-left-radius r2}}))

(def red
  (hsl 0 100 50))

(def orange
  (hsl 30 100 50))

(def green
  (hsl 120 100 50))

(def color-functions
  [;; dark red
   (color/darken red 25)
   ;; light red
   (color/lighten red 25)

   (color/mix red orange )

   ;; make yellow
   (color/color+ red green)

   ;; get a set of analogous colors
   (color/analogous red)])

(defstyles main
  [[:body
    {:font-family "sans-serif"
     :font-weight "bold"}]

   ;; sibling elements
   [:h1 :h2 {:font-size (px 16)}]

   ;; child selectors nested
   [:h1 [:a {:text-decoration "none"}]]

   ;; siblings with child selctors
   [:h1 :h2 [:a {:text-decoration "solid"}]]

   ;; nested vectors with multipe selectors
   [:h1 :h2 {:font-weight "lighter"}
    [:strong :b {:font-weight "bolder"}]]

   ;; referencing parent selector with &
   [:a {:font-weight "normal"
        :text-decoration 'none}  ;; declaration can be string, keyword or symbol
    [:&:hover
     {:font-weight :bolder
      :text-decoration 'underline}]]

   ;; literal strings need to be escaped
   [:body { :font-family "\"Liberation Mono\", Consolas, monospace"}]

   ;; adding vendor prefix
   [:box {:-moz {:border-radius (px 3)
                 :box-sizing "border-box"}}]

   ;; DRY mixins
   [:a reset-text-formatting]

   [:.box (partially-rounded (px 3))]

   ;; vectors/lists produce comma-separated list
   [:p {:font [(px 16) "sans-serif"]}]

   [:p {:font [[(px 16) "Helvetica"] "Arial" "sans-serif"]}]

   [:h2 {:color red}]

   ;; media queries
   [(at-media {:screen true} [:h1 {:font-weight :bold}])]

   [(at-media {:min-width (px 768) :max-width (px 979)}
              [:container {:width (px 960)}])]

   ;; nested media queries
   [:a {:font-weight :normal}
    [:&:hover {:color red}]
    (at-media {:screen true}
              [:&:hover {:color "pink"}])]

   ;; auto-prefixing vendors
  ;   [{:vendors ["webkit" "moz" "o"]
   ;  :auto-prefix #{:linear-gradient}
;   }
 ;   [:#foo {:linear-gradient red green}]
  ;   ]

   [:#url {:background [[(rgb 255 0 255) img-url "no-repeat" "fixed" "center"
                        ; :url "smiley.gif"
                         ]
                        ]
           :color green}

    ]

   [:#grad1 {:background (linear-gradient "to right" red green )
             :height (px 200)} ]

   ])
