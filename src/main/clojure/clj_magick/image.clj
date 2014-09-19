(ns clj-magick.image
  (:import 
    [org.im4java.core IMOperation ConvertCmd]))

(defn image-builder
  []
  (doto (new IMOperation)
    (.addImage)))


(defn gravity
  [builder ^String g]
  (.gravity builder g))

(defn resize
  [builder ^Integer w ^Integer h mode]
  (.resize builder (int w) (int h) mode)
  )



    ; op.addImage();
    ; op.thumbnail(100,100,'^');
    ; op.gravity("center");
    ; op.extent(100,100);
    ; op.addImage();

