# Notes
1. Comments in clojure - ;
2. Nullpointer exceptions :- 
```json
      ;((println "hello "))  ---> println will return null so never use unnesessory braces
```   

3. Caused by: java.lang.IllegalStateException: var: #'clojuredemo.clojure-functions/messenger2 is not public
If you try to access private function outside class - use `defn`
```json
(defn- messenger2 [greeting & who]
  (println greeting who)
  )
```


# Commands 
1. Run project 
    `lein run`
2. Run test - use packagename.test-class-name
    ` lein test clojuredemo.core-test`
3. `lein deps:tree`
   `lein run`

