module project.automatasim {
    requires javafx.controls;
    requires javafx.fxml;


    opens project.automatasim to javafx.fxml;
    exports project.automatasim;
}