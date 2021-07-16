(ns build
  (:require [clojure.tools.build.api :as b]))

(def lib 'fiv0/tools.build-testing)
(def version (format "1.2.%s" (b/git-count-revs nil)))
(def class-dir "target/classes")
(def basis (b/create-basis {:project "deps.edn"}))
(def uber-file (format "target/%s-%s-standalone.jar" (name lib) version))

(defn clean [_]
  (b/delete {:path "target"}))

(defn java [_]
  (b/javac {:src-dirs ["src"]
            :class-dir "target/classes"}))

(comment
  (java nil))
