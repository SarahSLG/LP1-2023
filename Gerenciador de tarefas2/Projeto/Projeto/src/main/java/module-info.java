module gaeeds.projeto {
    requires jakarta.persistence;
    requires javafx.controls;
    requires org.hibernate.orm.core;
    requires javafx.fxml;
    requires java.naming;


    opens GerenciadorDeTarefas.projeto to javafx.fxml;
    exports GerenciadorDeTarefas.projeto;
}