(ns styles.garden-examples.tutorial-07
  (:require [garden.color :refer [rgb rgba]]
            [garden.def :refer [defstyles]]
            [garden.units :refer [em percent px]]))

(def grey (rgb 204 204 204))

; aaa
(def darkish-grey (rgb 170 170 170))

; eee
(def lightish-grey (rgb 238 238 238))

(defstyles tutorial-07
  [[:.wrapper {:width (percent 60)
               :margin [[(px 20) :auto (px 40) :auto]]}]
   [:#display
    [:p {:margin 0
         :padding [[(em 1) 0 (em 1) 0]]}]

    [:.one {:background-color grey
            :border-left [[(px 2) :solid darkish-grey]]
            :padding (em 1)
            :margin (em 1)}]

    [:.two {:background-color grey
            :border [[(px 2) :solid darkish-grey]]
            :padding (em 1)
            :display :inline}]

    [:a {:background-color grey
         :text-decoration :none
         :padding (em 1)}
     [:&.block {:display :block
                :margin (em 1)
                :padding (em 1)}]
     [:&.inline-block {:display :inline-block
                       :margin (em 1)
                       :padding (em 1)
                       :width (px 200)}]]]
   [:#margin-and-padding [:p {:border [[(px 2) :solid darkish-grey]]
                              :background-color lightish-grey}
                          [:&.margin-test {:margin (em 2)}]
                          [:&.padding-test {:padding (em 2)}]]]

   [:#image-with-text {:border-top [[(px 2) :solid grey]]}
    [:img {:float :right
           :margin [[(em 0.5) 0 (em 1) (em 1)]]}]
    [:#head-coaches {:clear :both
                     :border-top [[(px 2) :solid grey]]}]]

   [:#positioning-1
    [:.box1 {:width (px 300)
             :padding (px 20)
             :border-left [[(px 5)  :solid (rgb 130 108 84)]]
             :background-color (rgb 244 234 199)
             :position :absolute
             ;:top (px 1500)
             :left (px 10)}]
    [:.box2 {:width (px 300)
             :padding (px 20)
             :border-left [[(px 5) :solid (rgb 216 174 158)]]
             :border-bottom [[(px 5) :solid (rgb 107 107 107)]]
             :background-color (rgb 250 230 232)
             :position :absolute
             ;:top (px 1800)
             :right (px 30)}]]

   [:#judo {:top (px 2000)
            :border-top [[(px 3) :solid grey]]
            :border-bottom [[(px 3) :solid darkish-grey]]}
    [:ul.gallery {:margin 0
                  :padding 0
                  :list-style :none}
     [:li {:display :inline-block
           :width (px 240)
           :margin [[(px 10) (px 20) (px 10) 0]]
           :border [[(px 1) :solid (rgb 0 0 0)]]
           ; make li element the positioning context e.g. for span.
           :position :relative
           :box-shadow [[(px 1) (px 2) (px 5) (px 2) (rgba 0 0 0 0.3)]]}
      [:&:hover [:span {:margin-left 0}]]]
     [:img {:display :block}]
     [:span {:position :absolute
             :bottom 0 ; try to comment this out and see how span drops below image
             :left 0
             :background-color (rgba 0 0 0 0.7)
             :color (rgb 255 255 255)
             :width (px 220)
             :padding (px 10)
             :margin-left (px -9999)}]]]
   ])
