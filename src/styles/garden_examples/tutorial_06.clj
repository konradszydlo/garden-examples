(ns styles.garden-examples.tutorial-06
  (:require [garden.color :refer [rgb rgba]]
            [garden.def :refer [defcssfn defstyles]]
            [garden.selectors :as selectors :refer [attr=]]
            [garden.units :refer [em percent px]]))

(defcssfn url)

(defstyles tutorial-06
  [[:body {:background-color (rgb 255 255 255)
           :color (rgb 17 17 17)
           :margin 0
           :padding 0}]

   [:.wrapper {:width (percent 80)
               :margin [[(px 20) :auto (px 40) :auto]]}]

   [:#contact-form {:width (px 400)}
    [:div {:float :left
           :width (px 400)
           :padding [[0 0 (em 0.75) 0]]}]
    [:label {:float :left
             :width (px 120)}]
    [:textarea :input {:float :right
                       :width (px 250)
                       :border-top [[(px 1) :solid (rgb 153 153 153)]]
                       :border-right [[(px 1) :solid (rgb 204 204 204)]]
                       :border-bottom [[(px 1) :solid (rgb 207 207 207)]]
                       :border-left [[(px 1) :solid (rgb 207 207 207)]]
                       :box-shadow [[:inset (px -2) (px 1) (px 2) (px 2) (rgba 0 0 0 0.1)]]
                       :padding (px 4)}
     [:&:focus {:background-color (rgb 173 179 197)}]]
    [(selectors/input (attr= "type" "submit")) {:float :none
                                                :width :auto
                                                :padding (em 0.25)
                                                :box-shadow [[(px -2) (px 1) (px 2) (px 2) (rgba 0 0 0 0.1)]]
                                                :font-size (percent 125)
                                                :border-radius (px 3)
                                                }
     ; form input[type="submit"]:focus
     [:&:focus {:background-color (rgb 251 239 142)}]]
    [:div.submit {:text-align :right}]

    [:input:focus:required:invalid {:background-image (url "../../../resources/public/images/gear-01.png")
                                    :background-position [[(percent 98) :center]]
                                    :background-repeat :no-repeat}]

    [:input:required:valid {:background-image (url "../../../resources/public/images/star.gif")
                            :background-position [[(percent 98) :center]]
                            :background-repeat :no-repeat}]

    [(selectors/input (attr= "type" "email"))
     [:&:required:invalid {:background-image (url "../../../resources/public/images/gear-01.png")}]]]

   [:#contact-form-register {:background-color (rgb 244 252 232)
                             :width (px 500)
                             :padding  (em 1)
                             :border-radius (px 10)
                             :clear :both}
    [:fieldset {:background-color (rgba 126 208 214 0.3)
                :border [[(px 3) :solid (rgb 255 255 255)]]
                :border-radius (px 10)
                :margin [[0 0 (em 1) 0]]}
     [:&:hover {:background-color (rgba 126 208 214 0.5)}]
     [:div:first-of-type {:padding-top (em 1)}]]
    [:legend {:font-size (percent 133)}]
    [:div {:float :left
           :width (percent 100)
           :padding [[0 0 (em 0.75) 0]]
           :position :relative}
     [:label [:em {:position :absolute
                   :color (rgb 255 0 0)
                   :right 0}]]
     [:&.submit {:float :none
                 :background-color (rgba 126 208 214 0.3)
                 :border [[(px 3) :solid (rgb 255 255 255)]]
                 :border-radius (px 10)
                 :margin [[0 0 (em 1) 0]]
                 :padding [[(em 0.5) 0 (em 0.5) 0]]
                 :text-align :center}]]
    [[:p.help {:font-style :italic
               :padding [[0 (em 1) (em 1) (em 1)]]}
      [:em {:color (rgb 255 0 0)}]]]
    [:label {:float :left
             :width (percent 37)
             :font-size (percent 116.7)}]
    [:input {:width (percent 55)
             :font-size (percent 133)
             :border 0
             :border-radius (px 10)
             :padding (em 0.25)}]
    [(selectors/input (attr= "type" "submit")) {:width :auto
                                                :border [[(px 3) :solid (rgb 126 208 214)]]
                                                :background-color (rgba 78 150 137 0.5)
                                                :color (rgb 255 255 255)}
     [:&:hover {:background-color (rgb 78 150 137)}]]]

   [:.wrapper-form
    {:width (percent 90)
     :margin [[(px 20) :auto (px 40) :auto]]}
    [:form {:border [[(px 3) :solid (rgb 204 204 204)]]
            :background-color (rgb 252 252 102)
            :padding (em 1)
            :border-radius (px 10)}
     [:p {:line-height 2.5}
      [:&.helptext {:line-height 1.4
                    :font-style :italic}]]
     [:input {:border-top [[(px 1) :solid (rgb 153 153 153)]]
              :border-right [[(px 1) :solid (rgb 204 204 204)]]
              :border-bottom [[(px 1) :solid (rgb 207 207 207)]]
              :border-left [[(px 1) :solid (rgb 207 207 207)]]
              :box-shadow [[:inset (px -2) (px 1) (px 2) (px 2) (rgba 0 0 0 0.1)]]
              :padding (px 4)}
      [:&:focus:required:invalid {:background-image (url "../../../resources/public/images/list.gif")
                                  :background-position [[(percent 98) :center]]
                                  :background-repeat :no-repeat}]
      [:&:required:valid {:background-image (url "../../../resources/public/images/star.gif")
                          :background-position [[(percent 98) :center]]
                          :background-repeat :no-repeat}]]
     [(selectors/input (attr= "type" "email")) [:&:focus:required:invalid {:background-image (url "../../../resources/public/images/globe.jpeg")}]]
     [(selectors/input (attr= "type" "submit")) {:width :auto
                                                 :border [[(px 3) :solid (rgb 204 204 204)]]
                                                 :background-color (rgb 255 255 255)
                                                 :color (rgb 51 51 51)
                                                 :border-radius (px 5)
                                                 :font-weight :bold}]]]])
