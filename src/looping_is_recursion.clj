(ns looping-is-recursion)

(defn power [base exp]
  (let [temp (fn [base exp power]
               (cond
                (zero? base) 0
                (zero? exp) power
                :else (recur base (dec exp) (* power base))))]
    (temp base exp 1)))

(defn last-element [a-seq]
  (if (empty? (rest a-seq))
    (first a-seq)
    (recur (rest a-seq))))

(defn seq= [seq1 seq2]
  (let [temp (fn [seq1 seq2]
                 (cond
                  (and (empty? seq1)(empty? seq2)) true
                  (and (not(empty? seq2)) (empty? seq1) ) false
                  (and (not(empty? seq1)) (empty? seq2)) false
                  (= (first seq1) (first seq2)) (recur (rest seq1) (rest seq2))
                  :else false))]
    (temp seq1 seq2)))

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

