(ns clojure_api.view
  (:use hiccup.page hiccup.element))

(defn index-view []
  (html5
    [:h1 "My Clojure API"]))

(defn not-found-view []
  (html5
    [:h1 "404 - Page Not Found"]))