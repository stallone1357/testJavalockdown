package be.ehb.vbexamen.controller;

import be.ehb.vbexamen.model.Item;
import be.ehb.vbexamen.model.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    ItemDAO dao;

    //@RequestMapping(value = "/item", method= RequestMethod.GET)


    @RequestMapping(value = "/item", method= RequestMethod.GET)
    @ResponseBody
    public Iterable<Item> getAllItems(){
        return dao.findAll();
    }



    @RequestMapping(value = "/item/{idnum}", method= RequestMethod.GET)
    @ResponseBody
    public List<Item> getById(@PathVariable(value = "idnum") int idnum){
        return dao.findItemById(idnum);
    }
    @RequestMapping(value = "/item{cat}", method= RequestMethod.GET)
    @ResponseBody
    public List<Item> getByCat(@PathVariable(value = "cat") String cat){
        return dao.findItemByCategorie(cat);
    }
    @RequestMapping(value = "/item/new", method= RequestMethod.POST)
    @ResponseBody
    public void createNew(@RequestParam (value = "naam") String naam,
                          @RequestParam (value = "prijsPerstuk") int prijs,
                          @RequestParam (value = "aantal") int aantal,
                          @RequestParam (value = "categorie") String cat){
        Item item = new Item(naam,prijs, aantal, cat);
        dao.save(item);
    }

    @RequestMapping(value = "/item/total", method= RequestMethod.GET)
    @ResponseBody
    public int totalPrice(){
        return 1;
    }
    @RequestMapping(value = "/item/update", method= RequestMethod.GET)
    @ResponseBody
    public void update(@RequestParam (value = "naam") String naam,
                       @RequestParam (value = "prijsPerstuk") int prijs,
                       @RequestParam (value = "aantal") int aantal,
                       @RequestParam (value = "categorie") String cat){

    }



}
