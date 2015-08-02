(ns styles.garden-examples.tutorial-02
  (:require [garden.color :refer [rgb]]
            [garden.def :refer [defcssfn defstyles]]
            [garden.selectors :as selectors :refer [a attr]]
            [garden.units :refer [em ex percent px]]))

(defcssfn url)

(def very-dark-blue
  (rgb 25 25 112))

(def light-greyish-blue
  (rgb 201 195 237))

(def moderate-blue
  (rgb 106 90 205))

(def red
  (rgb 255 0 0))

(def yellow
  (rgb 255 255 0))

(defstyles tutorial-02
  [[:p {:font-family "Verdana"}]

   [:p {:font-family ["Verdana" "Geneva" "Arial" "Helvetica" "sans-serif"]}]

   [:p {:font-size (em 0.9)}]

   ;; ex is the size of 'x'. Rarely used in web design
   [:p {:font-size (ex 1.1)}]

   [:p {:font-size :small
        :line-height 2.2
        :text-align :justify}]

   [:em {:font-size :larger}]

   [:div :p :em :a :code {:font-size (percent 130)}]

   [:a
    [:&:link :&:visited {:text-decoration :none} ]]

   [:a
    [:&:link :&:visited {:text-decoration [[:underline :overline]]}]]

   [:a
    [:&:link :&:visited
     {:text-decoration :underline
      :color moderate-blue
      :background-color :transparent}]
    [:&:hover :&:active
     {:text-decoration [[:underline :overline]]
      :color very-dark-blue
      :background-color light-greyish-blue}]]

   [:.boxout {:color (rgb 255 255 255)
              :background-color moderate-blue}
    [:a
     [:&:link :&:visited
      {:text-decoration :underline
       :color (rgb 228 226 246)
       :background-color :transparent}]
     [:&:hover :&:active
      {:background-color light-greyish-blue
       :color very-dark-blue
       :text-decoration :none}]]]

   [:li:first-child {:color red}]

   [:h1 {:background-color (rgb 173 216 230)
         :color (rgb 37 101 121)
         :font [[(em 1.6) "Verdana"] "Arial" "sans-serif"]
         :padding (em 0.2)
         :border-bottom [[(px 1) :solid (rgb 170 170 170)]]}]

   ;; a[target='_blank']
   [(a (attr "target" := "_blank")) {:background-color yellow}]

   ;; h1 + p
   [(selectors/+ :h1 :p)
    {:margin-top 0}]

   [:.hilite {:background-color (rgb 255 255 204)
              :color (rgb 178 34 34)}]

   [:.indent {:padding-left (em 1.5)
              :text-indent (em 1)}]

   [:.centered {:text-align :center}]

   [:.transform-uppercase {:text-transform :uppercase}]

   [:.transform-capitalize {:text-transform :capitalize}]

   ; h1 + p:first-letter
   [(selectors/+ :h1 :p:first-letter)
    {:font-size (percent 200)
     :font-weight :bold
     :float :left
     :width (em 1)
     :line-height 1}]

   [:h1 {:font-size (percent 205)
         :color (rgb 37 101 121)
         :text-shadow [[(px 3) (px 3) (px 3) (rgb 60 60 60)]]}]

   [:#recipies-list {:list-style-type :square}]

   ;; image is not loaded for some reason
   [:#cheese-list {:list-style-image (url "images/star.gif" )}]

   [:#baked-garlic-ingredients
    {:list-style-type :none
     :padding-left 0
     :margin-left 0}]

   [:ul.nav [:li
             {:display :inline}]]])
