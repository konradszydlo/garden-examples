(defproject garden-examples "0.1.0-SNAPSHOT"
  :description "A series of examples showing Garden plugin to create CSS in Clojure"
  :url "https://github.com/konradszydlo/garden-examples"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [garden "1.2.5"]]

  :plugins [[lein-garden "0.2.6"]]

  :garden {:builds [{:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.main/main
                     :compiler {:output-to "resources/public/css/main.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-01/tutorial-01
                     :compiler {:output-to "resources/public/css/tutorial-01.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-02/tutorial-02
                     :compiler {:output-to "resources/public/css/tutorial-02.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-03/tutorial-03
                     :compiler {:output-to "resources/public/css/tutorial-03.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-04/tutorial-04
                     :compiler {:output-to "resources/public/css/tutorial-04.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-05/tutorial-05
                     :compiler {:output-to "resources/public/css/tutorial-05.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-06/tutorial-06
                     :compiler {:output-to "resources/public/css/tutorial-06.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-07/tutorial-07
                     :compiler {:output-to "resources/public/css/tutorial-07.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-a
                     :compiler {:output-to "resources/public/css/tutorial-08-a.css"}}
                    {:source-paths ["src/styles/garden_example"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-b
                     :compiler {:output-to "resources/public/css/tutorial-08-b.css"}}
                    {:source-paths ["src/styles/garden_example"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-c
                     :compiler {:output-to "resources/public/css/tutorial-08-c.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-d
                     :compiler {:output-to "resources/public/css/tutorial-08-d.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-e
                     :compiler {:output-to "resources/public/css/tutorial-08-e.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-e-print
                     :compiler {:output-to "resources/public/css/tutorial-08-e-print.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-responsive-images-basic
                     :compiler {:output-to "resources/public/css/tutorial-08-responsive-images-basic.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-responsive-images-410
                     :compiler {:output-to "resources/public/css/tutorial-08-responsive-images-410.css"}}
                    {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-responsive-images-700
                     :compiler {:output-to "resources/public/css/tutorial-08-responsive-images-700.css"}}
                     {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-responsive-images-940
                      :compiler {:output-to "resources/public/css/tutorial-08-responsive-images-940.css"}}
                      {:source-paths ["src/styles/garden_examples"]
                     :stylesheet styles.garden-examples.tutorial-08/tutorial-08-responsive-images-1180
                     :compiler {:output-to "resources/public/css/tutorial-08-responsive-images-1180.css"}}
                    ]})
