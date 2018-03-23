(ns functional-programming.core
  (:gen-class))

; intermediate functional programming

(def mylist '(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15))





(defn -main
  [& args]
  ; (filter f coll)
  ; return a new list only containing elements of coll for which f evaluates to true
  (println (filter even? mylist))
  (println (filter pos? mylist))

  ; challenge: filter to multiples of 3
  (println (filter #(= 0 (rem % 3)) mylist))

  (println (map #(/ % 2) (filter even? mylist)))




  ; (map f coll)
  ; return a new list by applying f to each element of coll.
  (println (map even? mylist))
  (println (map #(* % %) mylist))

  ; challenge: map the even elements of mylist to half their value


  ; challenge: square each value of mylist; then produce only the values
  ; that fall between 10 and 40
  (println (filter #(<= 10 % 40) (map #(* % %) mylist)))


  ; challenge: implement map as a clojure function




  ; (reduce f val coll)
  ; f is a function of 2 arguments. returns the result of applying f
  ; to val and the first element of coll, then applying f to that result
  ; and the second element of coll, etc.
  ; reminder: operators are functions.
  (println (reduce + 0 mylist))
  (println (reduce * 1 mylist))

  ; write a function to find the largest value in a collection



  ; challenge: find the sum of the even elements of mylist



  ; challenge: find the sum of half of each even element in mylist



  ; challenge: implement reduce as a clojure function



  )

(-main)



(defn square-coll [coll]
  (cond (empty? coll)
        nil

        :else
        (cons (* (first coll) (first coll))
              (square-coll (next coll)))))













