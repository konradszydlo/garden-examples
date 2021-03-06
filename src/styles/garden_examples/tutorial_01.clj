(ns styles.garden-examples.tutorial-01
  (:require [garden.color :refer [rgb]]
            [garden.def :refer [defcssfn defstyles]]
	    [garden.selectors :as selectors]
            [garden.units :refer [percent px]]))

(def light-greyish-yellow
  (rgb 240 233 197))

(def red
  (rgb 255 0 0))

(defstyles tutorial-01

  [[:body
    {:font-weight "bold"}]
   [:h1 :h2 {:font-family ["Times New Roman" "Times" "serif"]
             :color (rgb 51 102 204) } ]
   [:.sidebar {:color (rgb 255 255 255)}]

   [:.nagigation [:li
                  {:border-bottom [[(px 1) :solid (rgb 153 153 153)]]}
                  [:&:last-child {:border-bottom :none}]]]

   ;; tr:nth-child(odd) td {
   ;; background-color:
   ;; }
   ; not working
;   [:tr [[:&(nth-child "odd") {:background-color light-greyish-yellow}]]]

 [((selectors/tr (selectors/nth-child "odd"))) {:background-color (rgb 223 231 242)
                                                    :color (rgb 0 0 0)}]

   [:li
    [:&:only-child {"list-style-type" :none}]]

   [:.wrapper [:&:first-letter
               {:font-size (percent 400)
                :font-weight :bold
                :color red}]]

   [:.wrapper
    [:&:first-line
     {:font-size (percent 200)
      :font-weight :bold}]]

   [:.article
    [:&:before {"content" "\"Start here\""}]
    [:&:after {"content" "\"End here\""}
     ]]

   ])
