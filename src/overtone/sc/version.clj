(ns overtone.sc.version)

(def OVERTONE-VERSION {:major 0
                       :minor 6
                       :patch 0
                       :snapshot true})

(def OVERTONE-VERSION-STR
  (let [version OVERTONE-VERSION]
    (str "v"
         (:major version)
         "."
         (:minor version)
         (if-not (= 0 (:patch version)) (:patch version) "")
         (if (:snapshot version) "-dev" ""))))
