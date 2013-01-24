(defproject rest-playground "0.1.0-SNAPSHOT"
  :description "Compojure implementation of simple test service"
  :url "http://github.com/SakulK"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
                 [cheshire "5.0.1"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler rest-playground.handler/app :port 8080}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})
