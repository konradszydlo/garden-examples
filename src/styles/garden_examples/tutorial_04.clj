(ns styles.garden-examples.tutorial-04
  (:require [garden.color :refer [rgb rgba]]
            [garden.def :refer [defcssfn defstyles]]
            [garden.selectors :as selectors :refer [a attr-starts-with]]
            [garden.units :refer [em percent px]]))

(def white (rgb 255 255 255))

(defcssfn url)

(defstyles tutorial-04
  [[:body {:background-color white
           :color (rgb 0 0 0)
           :margin 0
           :padding 0
           :font [[(em 0.75)] "Verdana" "Tahoma" "sans-serif"]}]

   [:.wrapper {:width (percent 80)
               :margin [[(px 20) :auto (px 40) :auto]]}]

   [:.nav {:list-style :none
           :margin 0
           :padding 0
           :width (px 200)}

    [:li {:border-left [[(px 10) :solid (rgb 144 154 181)]]
          :border-bottom [[(px 1) :solid (rgb 144 154 181)]]}

     [:a [:&:link :&:visited {:background-color (rgb 192 202 229)
                              :color (rgb 49 52 61)
                              :padding (em 0.5)
                              :display :block
                              :text-decoration :none
                              :border-left [[(px 5) :solid (rgb 239 213 252)]]}]
      [:&:hover {:background-color (rgb 144 154 181)
                 :color white
                 :border-left [[(px 5) :solid (rgb 250 136 234)]]}]]]
    [:ul {:list-style :none
          :margin 0
          :padding 0
          :border 0}
     [:li {:border 0}
      [:a [:&:link :&:visited {:background-color (rgb 237 241 252)
                               :color (rgb 49 52 61)
                               :padding [[(em 0.5) (em 0.5) (em 0.5) (em 1)]]
                               :display :block
                               :text-decoration :none
                               :border-left [[(px 5) :solid (rgb 239 213 252)]]}]
       [:&:hover {:background-color white
                  :color (rgb 49 52 61)
                  :border-left [[(px 5) :solid (rgb 239 213 252)]]}]]]]]

   [:.nav-sport {:list-style :none
                 :margin 0
                 :padding 0}
    [:li {:float :left
          :min-width (em 8)
          :margin-right (em 0.5)
          :text-align :center}
     [:a [:&:link :&:visited {:background-color white
                              :color (rgb 85 85 102)
                              :display :block
                              :padding (em 0.2)
                              :text-decoration :none
                              :font-weight :bold
                              :margin [[0 0 (em 0.2) 0]]
                              :border-radius (px 3)
                              :box-shadow [[(px 3) (px 3) (px 3) (px 3) (rgba 43 43 77 0.5)]]
                              }]
      [:&:hover {:background-color (rgba 255 255 255 0.8)
                 :color (rgb 43 43 77)}]]]]

   [:.nav-prog-lang {:list-style :none
                     :margin 0
                     :padding 0
                     :float :left
                     :width (percent 100)}
    [:li {:float :left
          :min-width (em 8)
          :text-align :center}
     [:a [:&:link :&:visited {:background-color (rgba 255 255 255 0.4)
                              :color (rgb 0 0 0)
                              :text-decoration :none
                              :display :block
                              :padding (em 0.75)
                              :border-radius [[(px 3) (px 3) 0 0]]
                              :box-shadow [[0 (px -3) (px 2) (rgba 0 0 0 0.5)]]
                              :text-shadow [[(px 1) (px 1) (px 3) (rgba 0 0 0 0.5)]]}]]
     [:&.selected [:a [:&:link :&:visited {:background-color white}]]]
     [:a [:&:hover {:background-color (rgba 255 255 255 0.8)}]]]]
   [:.content {:clear :both
               :background-color white
               :color (rgb 0 0 0)
               :padding (em 1)}]

   [:h1 {:font-size (percent 128.6)}]

   [:body {:background-image (url "../../../resources/public/images/brushed_alu_dark.png")}]

   [:.nav-fruits {:list-style :none
                  :margin 0
                  :padding 0}
    [:li {:float :left
          :width (px 130)
          :margin-right (px 20)}
     [:a [:&:link :&:visited {:text-decoration :none
                              :color (rgb 93 78 72)
                              :font-style :italic}
          [:strong {:font-size (percent 157.1)
                    :display :block
                    :font-weight :normal
                    :color (rgb 110 70 72)
                    :font-style :normal}]]
      ;; .nav-fruits li a:hover, .nav-fruits li a:hover strong
      ;; style fruit and description to different colours
     ; [:&:hover {:color white}
      ; [:strong {:color  (rgb 110 20 30)}]]

      ;; style fruit and description to one colour
      ;; have to repeat :color white block for a:hover and a:hover strong
      ;; looks like cannot have shared declaration for parent and child elements
      [:&:hover {:color white}
       [:strong  {:color white}]]
      ]]]

   [:.external-search {:clear :both
                       :padding-top (px 10)}]

   ;; a[href^="http:"]
   [(a (attr-starts-with "href" "https:")) {:padding-left (px 30)
                                            :background-image (url "../../../resources/public/images/globe.jpeg")
                                            :background-repeat :no-repeat}]

   [:.intouch {:list-style :none
               :margin 0
               :padding 0}
    [:li [:a [:&:link :&:visited {:padding [[(em 0.5) 0 (em 0.5) (px 185)]]
                                  :display :block
                                  :font-weight :bold
                                  :background-image (url "../../../resources/public/images/image_sprite_02.png")
                                  :background-repeat :no-repeat
                                  :text-decoration :none
                                  :color (rgb 136 136 136)}]]
     [:&.twitter [:a [:&:link :&:visited {:background-position [[0 (px 6)]]}]
                  [:&:hover {:background-position [[0 (px -90)]]
                             :color (rgb 105 210 231)}]]]
     [:&.rss [:a [:&:link :&:visited {:background-position [[0 (px -30)]]}]
              [:&:hover {:background-position [[0 (px -126)]]
                         :color (rgb 243 134 48)}]]]
     [:&.email [:a [:&:link :&:visited {:background-position [[0 (px -60)]]}]
                [:&:hover {:background-position [[0 (px -156)]]
                           :color (rgb 56 55 54)}]]]]]

   [:.intouch-opacity {:background-color white
                       :list-style :none}
    [:li [:a [:&:link :&:visited {:padding [[(em 0.6) 0 (em 0.6) (px 185)]]
                                  :display :block
                                  :font-weight :bold
                                  :background-image (url  "../../../resources/public/images/image_sprite_02.png")
                                  :background-repeat :no-repeat
                                  :text-decoration :none}]]
     [:&.twitter [:a [:&:link :&:visited {:background-position [[0 (px 10)]]
                                          :color (rgb 105 210 231)
                                          :opacity 0.5}]
                  [:&:hover {:opacity 1}]]]
     [:&.rss [:a [:&:link :&:visited {:background-position [[0 (px -24)]]
                                      :color (rgb 243 134 48)
                                      :opacity 0.5}]
              [:&:hover {:opacity 1}]]]
     [:&.email [:a [:&:link :&:visited {:background-position [[0 (px -60)]]
                                        :color (rgb 56 55 54)
                                        :opacity 0.5}]
                [:&:hover {:opacity 1}]]]
     ]]

   [:.sitemap {:list-style :none
               :margin 0
               :padding 0
               :background-color white}
    [:ul {:margin [[(em 1) 0 (em 1) 0]]
          :padding 0
          :list-style :none
          :line-height 1.8}
     [:ul {:margin [[(em 0.5) 0 (em 0.5) 0]]}
      [:a [:&:link:before :&:visited:before {:content "\"> \""}]]]
     [:a [:&:link :&:visited {:padding (em 0.75)
                              :text-decoration :none
                              :color (rgb 69 80 83)}]]]]

   [(selectors/> :.sitemap :li) {:border [[(px 2) :solid (rgba 153 178 183 0.2)]]

                                 :border-radius (px 10)
                                 :margin [[0 0 (em 1) 0]]}
    [:&:hover {:border [[(px 2) :solid (rgba 153 178 183 1)]]}]]

   [(selectors/> :.sitemap :li :a) [:&:link :&:visited {:background-color (rgba 153 178 183 0.1)
                                                        :color (rgb 0 0 0)
                                                        :text-decoration :none
                                                        :display :block
                                                        :padding (em 0.75)}]]

   [(selectors/> :.sitemap :li:hover :a)
    [:&:link :&:visited {:background-color (rgba 153 178 183 0.5)}]]

   [:.nav-js {:list-style :none
              :margin 0
              :padding 0
              :font-size (percent 114.3)}
    [:li [:a [:&:link :&:visited {:display :block
                                  :text-decoration :none
                                  :color (rgb 122 106 83)}]
          [:&:hover {:color (rgb 153 178 183)}]]
     [:&:hover :&.sfHover [:ul {:margin-left 0}] ]]
    [:ul {:position :absolute
          :background-color (rgb 213 222 217)
          :border [[(px 5) :solid (rgb 153 178 183)]]
          :border-radius (px 10)
          :padding (em 0.5)
          :margin [[(em 0.5) 0 0 (px -9999)]]
          :box-shadow [[(px 2) (px 2) (px 2) (px 2) (rgba 0 0 0 0.2)]]
          :list-style :none
          :font-size (percent 85.7)
          :width (em 8)
          :line-height 1.8}
     [:li [:a [:&:link :&:visited {:color (rgb 0 0 0)}]
           [:&:hover {:color (rgb 122 106 83)}]]]]]

   [(selectors/> :.nav-js :li) {:float :left
                                :width (px 130)
                                :margin-right (px 20)
                                :position :relative}]





   ])
