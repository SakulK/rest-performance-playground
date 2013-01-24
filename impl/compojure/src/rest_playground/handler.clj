(ns rest-playground.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [cheshire.core :refer :all]))

(defn json-response [data & [status]]
	{:status (or status 200)
	 :headers {"Content-Type" "application/json"}
	 :body (generate-string data)})

(defn power [base exp]
	{:result (.intValue (Math/pow base exp))})

(defn parse [s] (Integer/parseInt s))

(defroutes app-routes
  (GET "/power/:base/:exp" [base exp] 
  	(json-response (power (parse base) (parse exp))))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
