(ns clojure-hello-world.core)

(defn hello [x]
  (str "Hello, " x))

(defn -main []
  (println "Hello, World!")
  (println (hello "Universe!")))


