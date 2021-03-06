package br.com.alura.springmvc.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.springmvc.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Celular Xiaomi Redmi 9 64GB");
		pedido.setDescricao("Tem uma tela Touchscreen de 6.53 polegadas com uma resolução de 2340x1080 pixel");
		pedido.setDataEntrega(LocalDate.now());
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/41s708mKqJL._AC_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Redmi-64GB-Dual/dp/B08B3QSVM6/ref=asc_df_B08B3QSVM6/?tag=googleshopp00-20&linkCode=df0&hvadid=379773236150&hvpos=&hvnetw=g&hvrand=14726664450638354454&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001773&hvtargid=pla-976739522567&psc=1");

		List<Pedido> pedidos = Arrays.asList(pedido);
		System.out.println("HOME");
		
		model.addAttribute("pedidos",pedidos);
		
		return "home";
	}
}
