(ns styles.garden-examples.tutorial-05
  (:require [garden.color :refer [rgb rgba]]
            [garden.def :refer [defstyles]]
            [garden.selectors :as selectors :refer [attr=]]
            [garden.units :refer [em percent px]]))

(def red (rgb 255 0 0))

(defstyles tutorial-05
  [[:.datatable {:border [[(px 1) :solid (rgb 51 139 166)]]
                 :border-collapse :collapse}
    [:td :th {:border [[(px 1) :solid (rgb 115 192 212)]]}]
    [:tr [:&:hover {:background-color (rgb 223 231 242)
                    :color (rgb 0 0 0)}]]]

   [:.borders {:width (percent 80)
               :margin [[(px 20) :auto (px 40) :auto]]}
    [:div {:background-color (rgb 204 204 204)
           :padding (em 0.5)
           :margin [[0 0 (em 1) 0]]}]]

   [:.double {:border [[(px 4) :double red]]}]

   [:.groove {:border [[(px 4) :groove red]]}]

   [:.inset {:border [[(px 4) :inset red]]}]

   [:.outset {:border [[(px 4) :outset red]]}]

   [:.ridge {:border [[(px 4) :ridge red]]}]

   [:.solid {:border [[(px 4) :solid red]]}]

   [:.dashed {:border [[(px 4) :dashed red]]}]

   [:.dotted {:border [[(px 4) :dotted red]]}]

   [:.none {:border :none}]

   [:.datatable-2 {:border [[(px 1) :solid (rgb 51 139 166)]]
                   :border-collapse :collapse}
    [:td {:border [[(px 1) :solid (rgb 51 139 166)]]
          :text-align :right
          :padding (em 0.2)}]
    [:th {:border [[(px 1) :solid (rgb 130 130 130)]]
          :background-color (rgb 188 188 188)
          :font-weight :bold
          :text-align :left
          :padding (em 0.2)}]
    [:caption {:font-size (percent 116.7)
               :font-weight :bold
               :background-color (rgb 176 196 222)
               :color (rgb 17 17 17)
               :padding [[(em 0.4) 0 (em 0.3) 0]]
               :border [[(px 1) :solid (rgb 120 154 198)]]}]]

   [:.datatable-students {:width (percent 100)
                          :border [[(px 1) :solid (rgb 214 221 230)]]
                          :border-collapse :collapse}
    [:td {:border [[(px 1) :solid (rgb 214 221 230)]]
          :padding (em 0.3)}]
    [:th {:border [[(px 1) :solid (rgb 130 130 130)]]
          :background-color (rgb 188 188 188)
          :font-weight :bold
          :text-align :left
          :padding-left (em 0.3)}]
    [:caption {:font [[:bold (percent 110) "Arial"] "Helvetica" "sans-serif"]
               :color (rgb 51 81 122)
               :text-align :left
               :padding [[(em 0.4) 0 (em 0.8) 0]]}]

    ; tr:nth-child(odd)
    [((selectors/tr (selectors/nth-child "odd"))) {:background-color (rgb 223 231 242)
                                                    :color (rgb 0 0 0)}]]
   [:.datatable-rugby-cup [:colgroup
                           [(selectors/nth-child "odd") {:background-color (rgb 128 201 255)
                                                         :color (rgb 0 0 0)}]
                           [(selectors/nth-child "even") {:background-color (rgb 191 228 255)
                                                          :color (rgb 0 0 0)}]]]

   [:.clmonth {:border-collapse :collapse
               :width (percent 80)}
    [:caption {:text-align :left
               :font-weight :bold
               :font-size (percent 116.7)
               :padding-bottom (em 0.4)}]
    [:th {:border [[(px 1) :solid (rgb 170 170 170)]]
          :border-bottom :none
          :padding [[(em 0.2) (em 0.6) (em 0.2) (em 0.6)]]
          :background-color (rgb 204 204 204)
          :color (rgb 63 63 63)
          :min-width (em 8)}]
    [:td {:border [[(px 1) :solid (rgb 234 234 234)]]
          :padding [[(em 0.2) (em 0.6) (em 0.2) (em 0.6)]]
          :vertical-align :top}
     [:&.previous :&.next {:background-color (rgb 246 246 246)
                           :color (rgb 198 198 198)}]
     [:&.active {:background-color (rgb 177 203 225)
                 :color (rgb 43 80 112)
                 :border [[(px 2) :solid (rgb 70 130 180)]]}]]
    [:ul {:list-style :none
          :margin 0
          :padding-left (em 1)
          :padding-right (em 0.6)}]
    [:li {:margin-bottom (em 1)}]]

   [:.clmonth-small {:border-collapse :collapse}
    [:caption {:text-align :left
               :font-weight :bold
               :font-size (percent 116.7)
               :padding-bottom (em 0.4)}]
    [:th {:border [[(px 1)] :solid (rgb 170 170 170)]
          :border-bottom :none
          :padding [[(em 0.2) (em 0.4) (em 0.2) (em 0.4)]]
          :background-color (rgb 204 204 204)
          :color (rgb 63 63 63)}]
    [:td {:border [[(px 1) :solid (rgb 234 234 234)]]
          :padding [[(em 0.2) (em 0.4) (em 0.2) (em 0.4)]]
          :vertical-align :top}
     [:&.previous :&.next  {:background-color (rgb 246 246 246)
                            :color (rgb 198 198 198)}]
      [:&.active {:background-color (rgb 177 203 225)
                 :color (rgb 43 80 112)
                  :border [[(px 2) :solid (rgb 70 130 180)]]}]]]

   [:.pricing {:border-collapse :collapse}
    [:col {:width (em 7)}
     [:&:first-child {:width :auto}]]
    [:td {:color (rgb 51 51 51)
          :border [[(px 1) :solid (rgb 255 255 255)]]
          :padding (em 0.75)}]
    [(selectors/tr (selectors/nth-child "odd")) {:background-color (rgb 246 246 246)}
     [:&:hover [:td {:background-color (rgba 59 87 95 0.2)}]]]
    [(selectors/tr (selectors/nth-child "even")) {:background-color (rgba 246 246 246 0.5)}
     [:&:hover [:td {:background-color (rgba 91 124 121 0.2)}]]]
    [:tr [:&:first-child {:background-color :transparent}
          [:&:hover [:td {:background-color :transparent}]]]]
    [(selectors/th (attr= "scope" "col")) {:background-color (rgb 59 87 98)
                                           :color (rgb 255 255 255)
                                           :border [[(px 1) :solid (rgb 255 255 255)]]
                                           :font-weight :normal
                                           :padding (em 0.75)
                                           :border-radius [[(px 10) (px 10) 0 0]]
                                           :text-shadow [[(px 1) (px 1) (px 3) (rgb 17 17 17)]]
                                           }]


    [(selectors/th (attr= "scope" "col") (selectors/nth-child "odd")) {:background-color (rgb 91 124 121)}]

    [:th [:span.price {:display :block
                       :padding [[(em 0.2) 0 0 0]]
                       :font-size (percent 87.5)
                       :font-weight :bold}]]

    [(selectors/th (attr= "scope" "row")) {:background-color (rgb 232 232 232)
                                           :color (rgb 0 0 0)
                                           :border [[(px 1) :solid (rgb 255 255 255)]]
                                           :padding (em 0.75)
                                           :font-weight :normal
                                           :text-align :left}]

    [ (selectors/descendant (selectors/tr (selectors/nth-child "odd")) (selectors/th (attr= "scope" "row")))  {:background-color (rgba 232 232 232 0.5)}]]])
