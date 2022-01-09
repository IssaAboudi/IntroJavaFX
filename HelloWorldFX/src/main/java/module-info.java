module com.issa.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.issa.helloworldfx to javafx.fxml;
    exports com.issa.helloworldfx;
}