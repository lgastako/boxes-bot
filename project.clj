(defproject boxes-bot "0.1.0-SNAPSHOT"
   :cljsbuild {:builds [{:source-paths ["src"]
                         :compiler {:output-to "target/boxes-bot.js"
                                    :optimizations :advanced
                                    :pretty-print true}}]}
   :plugins [[lein-cljsbuild "1.0.3"]]
   :hooks [leiningen.cljsbuild]
   :dependencies [[org.clojure/clojure "1.5.1"]
                  [org.clojure/clojurescript "0.0-2227"]
                  [its-log "0.2.2"]
                  [prismatic/dommy "0.1.2"]])
