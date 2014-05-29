(ns boxes-bot.core
  (:require [its.log :as log])
  (:require-macros [dommy.macros :refer [sel1]]))

(log/set-level! :debug)
(log/debug :boxes-bot :initializing)

(def state (atom {}))

(defn observe-changes [node cb]
  (let [observer (js/MutationObserver. cb)
        opts #js {:childList true
                  :attributes true
                  :characterData true
                  :subtree true}]
    (log/debug :node node)
    (.observe observer node opts)
    (js/console.log "observer registered on node: %o" node)
    #(.disconnect observer)))

(def table (sel1 "#boxes_id"))

(log/debug :table table)

(observe-changes table #(log/debug :change %))

(log/debug :boxes-bot :ready)
