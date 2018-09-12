(defproject org.jeffcarpenter.clojurenlp/core "3.8.0"
  :description "Clojure wrapper for the Stanford CoreNLP tools."
  :url "https://github.com/clojurenlp/core"
  :license {:name "Apache License, Version 2.0"
  	        :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [edu.stanford.nlp/stanford-corenlp "3.9.1"]
                 [edu.stanford.nlp/stanford-corenlp "3.9.1" 
                  :classifier "models"]
                 [org.clojure/data.json "0.2.6"]
                 [aysylu/loom "1.0.0"]
                 [org.slf4j/slf4j-simple "1.7.25"]]
  :plugins [[lein-auto "0.1.3"]])
