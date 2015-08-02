(ns styles.garden-examples.tutorial-03
  (:require [garden.color :refer [rgb rgba]]
            [garden.def :refer [defcssfn defstyles]]
            [garden.units :refer [em percent px]]))

(defcssfn url)

(defcssfn rotate)

(def images-folder-root
  "../../../resources/public/images/")

(defn img-url [name]
  (str images-folder-root name))

(def img-background-url
  (img-url "brushed_alu_dark.png"))

(def very-dark-grey
  (rgb 51 51 51))

(def dark-grey
  (rgb 153 153 153))

(defstyles tutorial-03
  [[:.album [:img  {:border [[(px 2) :solid  (rgb 0 0 0) ]]}]]

   [:body {:background-color very-dark-grey
           :background-image (url img-background-url )
           :background-attachment :fixed
           :background-repeat :no-repeat
           :color (rgb 255 255 255)
           :margin 0
           :padding 0}]

   [:.wrapper {:width (percent 80)
               :margin [[(px 20) :auto (px 40) :auto]]
               :background-color (rgb 255 255 255)
               :color very-dark-grey
               :background-image (url (str images-folder-root "brushed_alu.png"))
               :box-shadow [[(px 3) (px 3) (px 10) (px 8) (rgba 0 0 0 0.4)]]
               :border-radius (px 10)}]

   [:.box {:height (px 300)
           :width (px 300)
           :border [[(px 3) :solid very-dark-grey]]
           :background [[(url (img-url "star.gif")) :top :right :no-repeat]
                        [(url (img-url "gear-01.png")) :top :left :no-repeat]
                        [(url (img-url "gear-02.jpeg")) :bottom :left :no-repeat]
                        [(url (img-url "gear.jpg")) :bottom :right :no-repeat]
                        [(url (img-url "dawn.jpg"))]]}]

   [:ul.sports {:border-top [[(px 1) :solid dark-grey]]
                :border-bottom [[(px 1) :solid dark-grey]]
                :list-style :none
                :margin [[(em 1) 0 (em 1) 0]]
                :padding [[(em 1) 0 (em 1) (px 60)]]
                :background-image (url (str images-folder-root "clock.gif"))
                :background-repeat :no-repeat
                :background-position [[0 (em 1)]]}]

   [:h3.techniques {:background-image (url (str images-folder-root "list.gif"))
                    :background-repeat :no-repeat
                    :background-position [[:left :center]]
                    :padding-left (px 60)}]

   [:a.more
    [:&:link :&:visited
     {:display :block
      :padding [[(em 0.3) (px 70) (em 0.3) 0]]
      :text-align :right
      :color (rgb 102 102 102)
      :font-weight :bold
      :background-image (url (str images-folder-root "arrow.png"))
      :background-position [[:right :center]]
      :background-repeat :no-repeat
      :text-decoration :none}
     ]]

   [:h4 {:width (percent 60)
         :padding [[(em 0.6) (em 0.6) (em 0.6) (em 2)]]
         :margin [[(px 40) 0 0 0]]
         :font-size (percent 127.6)
         :background-color (rgb 255 255 255)
         :color (rgb 0 0 0)
         ;; text will dissapear as child elements inherit opacity
        ; :color (rgb 255 255 255)
         :opacity 0.5}]

   [:h5 {:width (percent 60)
         :padding [[(em 0.6) (em 0.6) (em 0.6) (em 2)]]
         :margin [[(px 40) 0 0 0]]
         :font-size (percent 105)
         :background-color (rgba 255 255 255 0.5)
        ; :color (rgb 0 0 0)
         ;; text won't dissapear as opacity is specified as rgba only for background
         :color (rgb 255 255 255)}]

   [:#tilted-img {:float :right
                  :width (px 500)
                  :margin [[(em 1) (em 2) (em 1) (em 1)]]
                  :box-shadow [[(px 3) (px 3) (px 5) (px 3) (rgba 0 0 0 0.4)]]
                  :transform (rotate "5deg")}]
   ])
