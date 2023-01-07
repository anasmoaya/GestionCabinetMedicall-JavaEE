module backend {
    requires jakarta.persistence;
    requires net.bytebuddy;
    requires com.fasterxml.classmate;
    requires  jakarta.xml.bind;
    requires org.hibernate.commons.annotations;
    requires org.hibernate.orm.core;



    opens com.cabinetmedical.backend.jcabinemedical.Entity to org.hibernate.orm.core;
    exports com.cabinetmedical.backend.jcabinemedical.Cabinet;
    exports com.cabinetmedical.backend.jcabinemedical.doa;
    exports com.cabinetmedical.backend.jcabinemedical.Entity;
}