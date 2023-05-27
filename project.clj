(defproject clj-polyglot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :main clj-polyglot.core
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :resource-paths ["kt.jar"] ; Required for Kotlin Code
  :java-source-paths ["src"] ; Required for Java Code
  :profiles {:dev {:dependencies [[speclj "3.4.3"]]}}
  :plugins [[speclj "3.4.3"]]
  :test-paths ["spec"])