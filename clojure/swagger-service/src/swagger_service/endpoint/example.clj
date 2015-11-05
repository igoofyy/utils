(ns swagger-service.endpoint.example
  (:require [compojure.core :refer :all]
            [clojure.java.io :as io]))

(defn example-endpoint [config]
  (routes
   (GET "/" [] "Hello World")))
