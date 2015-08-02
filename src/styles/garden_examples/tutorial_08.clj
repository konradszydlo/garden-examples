(ns styles.garden-examples.tutorial-08
  (:require [garden.color :refer [rgb rgba]]
            [garden.def :refer [defstyles]]
            [garden.selectors :as selectors]
            [garden.stylesheet :refer [at-media]]
            [garden.units :refer [em percent px]]))

(def wrapper
  [:.wrapper {:width (px 940)
              :margin [[0 :auto 0 :auto]]}])

(def header
   [:header {:text-align :right
              :padding [[(px 40) 0 0 0]]
              :border-bottom [[(px 8) :solid (rgb 59 67 68)]]
              :margin-bottom (px 40)}
    [:h1 {:font-size (percent 187.5)
          :border-bottom [[(px 1) :solid (rgb 59 67 68)]]
          :margin-bottom (px 2)
          :padding-bottom (px 10)
          :color (rgb 59 67 68)}
     [:span {:font-style :italic
             :color (rgb 241 47 93)}]]])

(def main-elements
  [[:body {:background-color (rgb 255 255 255)
           :color (rgb 59 67 68)
           :margin 0
           :padding 0}]
   [:h1 :h2 :h3 {:margin 0
                 :padding [[0 0 (em 1) 0]]
                 :text-shadow [[(px 1) (px 1) (px 2) (rgba 0 0 0 0.3)]]}]
   [:ul :ol :p {:margin 0
                :padding [[0 0 (em 1) 0]]}]
   [:h1 {:font-size (percent 137.5)
         :color (rgb 241 47 93)}]
   [:h2 {:font-size (percent 125)
         :color (rgb 241 47 93)}]
   [:h3 {:font-size (percent 100)}]
   [:a [:&:link :&:visited {:color (rgba 241 47 93 0.8)}]
    [:&:hover {:color (rgb 241 47 93)
               :text-decoration :none}]]
   [:.nav {:list-style :none
           :padding 0}
    [:a [:&:link :&:visited {:text-decoration :none
                             :display :block
                             :border-top [[(px 1) :solid (rgb 232 243 248)]]
                             :padding [[(em 0.5) 0 (em 0.5) 0]]
                             :color (rgb 66 148 182)}]
     [:&:hover {:background-color (rgba 232 243 248 0.3)}]]]
   [:.box {:border-top [[(px 1) :solid (rgb 219 230 236)]]
           :padding [[(em 1) 0 (em 1) 0]]}]])

(defstyles tutorial-08-a
  [main-elements
   wrapper
   header
   [:.main {:position :relative}]
   [:article {:position :absolute
               :top 0
               :left 0
               :width (px 540)}]
   [:aside {:width (px 300)
             :position :absolute
             :top 0
             :right 0}]])

(def footer-core
  {:clear :both
   :background-color (rgb 59 67 68)
   :color (rgb 255 255 255)
   :padding (px 20)
   :overflow :auto})

(def footer-a
  [:a [:&:link :&:visited {:color (rgb 255 255 255)}]])

(def footer-narrow
   [:footer footer-core
    [:.copy {:float :left
             :width (px 520)}]
    [:.vcard {:float :right
              :width (px 280)}]
    footer-a])

(defstyles tutorial-08-b
  [[:article {:float :left
              :width (px 540)}]
   [:aside {:width (px 300)
            :float :right}]
   main-elements
   wrapper
   header
   footer-narrow])

(defstyles tutorial-08-c
  [[:.subnav {:width (px 220)
              :float :left
              :margin-right (px 20)}]
   [:article {:float :left
              :width (px 440)}]
   [:aside {:width (px 220)
            :float :right}]
   main-elements
   wrapper
   header
   footer-narrow])

(def footer-wide
  [:footer (merge footer-core {:padding [[(px 20) 0]]})
    [:.copy {:float :left
             :width (px 220)}]
    [:.vcard {:float :right
              :width (px 220)}]
    footer-a])


(def footer-responsive
  [:footer (merge footer-core {:padding [[(px 20) 0]]})
    [:.copy {:float :left
             :width (percent 31.42857)}]
    [:.vcard {:float :right
              :width (percent 31.42857)}]
    footer-a])

(defstyles tutorial-08-d
  [[:.subnav {:width (px 220)
              :float :left
              :margin-right (px 20)}]
   [:article {:float :left
              :width (px 440)}]
   [:aside {:width (px 220)
            :float :right}]
   main-elements
   wrapper
   header
   [:header [:.inner {:border-bottom [[(px 1) :solid (rgb 59 67 68)]]
                      :margin-bottom (px 2)}]]
   footer-wide])

(defstyles tutorial-08-e
  [header
   [:header [:.inner {:border-bottom [[(px 1) :solid (rgb 59 67 68)]]
                      :margin-bottom (px 2)}]]
   main-elements
   footer-responsive

   [:.wrapper {:width (percent 90)
               :margin [[0 :auto 0 :auto]]}]

   (at-media {:screen :only :min-width (px 768)}
             [:.subnav {:width (percent 31.42857)
                        :float :left}]
             [:article {:float :right
                        :width (percent 65.71428)}]
             [:aside {:width (percent 100)
                      :clear :both}]
             [:footer [:.copy {:float :left
                               :width (percent 31.42857)}]
              [:.vcard {:float :right
                        :width (percent 31.42857)}]])
   (at-media {:screen :only :min-width (px 992)}
             [:.wrapper {:max-width (px 1180)}]
             [:.subnav {:width (percent 23.404255)
                        :margin-right (percent 2.1276596)}]
             [:article {:float :left
                        :width (percent 46.808511)}]
             [:aside {:width (percent 23.404255)
                      :float :right
                      :clear :none}]
             [:footer [:.copy {:width (percent 23.404255)}]
              [:.vcard {:width (percent 23.404255)}]])])

(defstyles tutorial-08-e-print
  [[:both {:background-color (rgb 255 255 255)
           :color (rgb 0 0 0)
           :padding (px 20)}]
   [:h1 :h2 :h3 {:margin 0
                 :padding [[0 0 (em 1) 0]]}]
   [:p {:margin 0
        :padding [[0 0 (em 1) 0]]}]
   [:ul :ol {:margin 0
             :padding [[0 0 (em 1) (em 1)]]}]
   [:h1 {:font-size (percent 137.5)}]
   [:h2 {:font-size (percent 125)}]
   [:h3 {:font-size (percent 100)}]
   [:a [:&:link :&:visited {:color (rgb 0 0 0)}]]
   [:header {:text-align :right
             :padding [[(px 20) 0 0 0]]
             :border-bottom [[(px 8) :solid (rgb 0 0 0)]]
             :margin-bottom (px 40)}
    [:h1 {:font-size (percent 187.5)
          :padding-bottom (px 10)}
     [:span {:font-style :italic}]]
    [:.inner {:border-bottom [[(px 1) :solid (rgb 0 0 0)]]
              :margin-bottom (px 2)}]]
   [:footer {:border-top [[(px 1) :solid (rgb 0 0 0)]]
             :padding [[(px 20) 0]]
             :overflow :auto}
    [:.vcard {:display :none}]]
   [:.wrapper {:width (percent 90)
               :margin [[0 :auto]]}]
   [:.subnav {:display :none}]
   [:aside {:display :none}]])

(defstyles tutorial-08-responsive-images-basic
  [[:body {:margin 0
           :padding 0
           :background-color (rgb 255 255 255)
           :color (rgb 59 67 68)}]
   [:.wrapper {:width (percent 90)
               :margin [[0 :auto]]}]
   [:img {:max-width (percent 100)
          :max-height (px 163)
          :display :block}]
   [:h1 :h2 :h3 {:margin 0
                 :padding 0}]
   [:h2 {:font-size (percent 125)
         :padding [[0 0 (em 1) 0]]}]
   [:p {:margin 0
        :padding [[0 0 (em 1) 0]]}]
   [:ul {:margin 0
         :padding 0}]
   [:a [:&:link :&:visited {:color (rgb 122 106 83)}]]
   [:header {:background-color (rgb 59 67 68)
             :color (rgb 255 255 255)
             :border-bottom [[(px 1) :solid (rgb 0 0 0)]]
             :margin-bottom (em 1)}
    [:.wrapper {:position :relative}]
    [:h1 {:display :inline-block
          :padding [[(em 1) 0 (em 0.3) 0]]
          :font-size (percent 125)
          :font-weight :normal
          :text-shadow [[(px 1) (px 1) (px 2) (rgba 0 0 0 0.7)]]}]
    [:.nav {:padding-bottom (em 1)}
     [:li {:display :inline
           :font-size (percent 125)
           :color (rgb 255 255 255)}]
     [:a [:&:link :&:visited {:text-decoration :none
                              :color (rgb 255 255 255)}]]]]
   [:.feature {:background-color (rgb 59 67 68)
               :color (rgb 255 255 255)
               :margin [[0 0 (em 1) 0]]}]
   [:.caption {:padding (em 0.3)
               :font-size (percent 87.5)
               :text-shadow [[(px 1) (px 1) (px 2) (rgba 0 0 0 0.7)]]}]
   [:.gallery :ul {:list-style-type :none
                   :margin [[0 0 (em 1) 0]]
                   :padding 0}]
   {:footer {:border-top [[(px 1) :solid (rgb 59 67 68)]]
             :font-size (percent 87.5)
             :padding [[(em 1) 0]]}}])

(defstyles tutorial-08-responsive-images-410
  [[:.gallery {:overflow :hidden
               :clear :both}
    [:li {:float :left
          :width (percent 48.78048)
          :margin [[0 0 (percent 2.1276596) (percent 2.1276596)]]}]
    [(selectors/li (selectors/nth-child "2n+1")) {:margin-left 0}]]])

(defstyles tutorial-08-responsive-images-700
  [[:header [:.nav {:position :absolute
                    :top (px 20)
                    :right 0
                    :list-style-type :none}
             [:li {:font-size (percent 175)}]]
    [:h1 {:padding [[(px 20) 0]]
          :font-size (percent 175)}]]
   [:.gallery
    [(selectors/li (selectors/nth-child "1n")) {:width (percent 31.42857)
                                                ;:margin [[0 0 (percent 2.1276596) (percent 2.1276596)]]
                                               :margin-left (percent 2.1276596) }]
    [(selectors/li (selectors/nth-child "2n+1")) {:margin-left (percent 2.1276596)}]
    [(selectors/li (selectors/nth-child "3n+1")) {:margin-left 0}]]])

(defstyles tutorial-08-responsive-images-940
  [[:.gallery {:overflow :hidden
               :clear :both}
    [(selectors/li (selectors/nth-child "1n")) {:width (percent 23.404255)
                                                :margin [[0 0 (percent 2.1276596) (percent 2.1276596)]]}]
    [(selectors/li (selectors/nth-child "4n+1")) {:margin-left 0}]]])

(defstyles tutorial-08-responsive-images-1180
  [[:.wrapper {:max-width (px 1180)}]
   [:.feature {:float :left
               :width (percent 79.66101)}]
   [:.intro {:float :left
             :width (percent 18.64406)}]
   [:.gallery
    [(selectors/li (selectors/nth-child "1n")) {:width (percent 18.64406)
                                                :margin [[0 0 (percent 1.69491) (percent 1.69491)]]}]
    [(selectors/li (selectors/nth-child "5n+1")) {:margin-left 0}]]
   ])
