module com.example.javafx_project_template {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_project_template to javafx.fxml;
    exports com.example.javafx_project_template;
}