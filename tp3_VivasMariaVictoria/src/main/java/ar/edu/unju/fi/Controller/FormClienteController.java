package ar.edu.unju.fi.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FormClienteController {
	@GetMapping({"/formulario"})
	public String getFormCliente() {
return "formCliente";
}
}
