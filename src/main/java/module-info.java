module com.coco.numcount.javafxstuffm3p219 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.coco.numcount.javafxstuffm3p219 to javafx.fxml;
    exports com.coco.numcount.javafxstuffm3p219;
}