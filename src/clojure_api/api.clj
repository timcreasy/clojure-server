(ns clojure_api.api
  (:use ring.middleware.json
        ring.util.response))

(defn get-users []
  (response {:name "John Appleseed"
             :email "john.appleseed@apple.com"
             :address "1 Oak Street, Nashville, TN 37221"
             :age 35
             :children [{:name "Anna Appleseed"
                         :age 15}
                        {:name "John Appleseed Jr."
                         :age 18}]} ))