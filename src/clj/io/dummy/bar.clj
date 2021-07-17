(ns io.dummy.bar
  (:import (io.dummy Foo)))

(def foo (Foo. 1))

(.getData foo)
