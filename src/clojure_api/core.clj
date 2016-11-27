(ns clojure_api.core
  (:use compojure.core)
  (:require [compojure.route :as route]
            [clojure_api.view :as view]
            [clojure_api.api :as api]))

(defroutes my_routes
  (GET "/" [] (view/index-view))
  (GET "/api/users" [] (api/get-users))
  (route/not-found (view/not-found-view)))

(def app
  (wrap-json-response my_routes))