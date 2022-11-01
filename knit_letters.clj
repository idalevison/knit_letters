(use 'clojure.java.io)
(with-open [rdr (reader "letters/a.txt")]
  (doseq [line (line-seq rdr)]
    (println line)))
