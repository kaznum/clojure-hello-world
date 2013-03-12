(ns clojure-hello-world.core-test
  (:use clojure.test
        clojure-hello-world.core))

(deftest hello_with_args
  (testing "Test an string argument."
    (is (= (hello "AAA") "Hello, AAA"))))

