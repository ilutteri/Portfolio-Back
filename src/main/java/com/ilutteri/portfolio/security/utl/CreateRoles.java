/* com.ilutteri.portfolio.security.utl;

import com.ilutteri.portfolio.security.entity.Rol;
import com.ilutteri.portfolio.security.enums.RolNombre;
import com.ilutteri.portfolio.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService roleService;

    @Override
    public void run(String... args) throws Exception {
        Rol roleAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol roleUser = new Rol(RolNombre.ROLE_USER);
        roleService.save(roleAdmin);
        roleService.save(roleUser);

    }
} */
