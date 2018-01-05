package controller.adrress;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dao.AddressDAO;
import dao.DaoException;
import dao.impl.AddressDaoImpl;
import model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//@RestController
public class TestController {

    @Autowired
    private AddressDAO addressDao;

    @RequestMapping(value="/viewemp/{pageid}")
    public ModelAndView edit(@PathVariable int pageid){
        int total=10;
        if(pageid==1){
            pageid = pageid -1;
        }
        else{
            pageid=(pageid-1)*total;
        }
        List<Address> list=addressDao.getEmployeesByPage(pageid,total);

        return new ModelAndView("/views/viewemp","list",list);
    }


    @RequestMapping(value = "/getListTestAjax", method = RequestMethod.GET)
//    @ResponseBody
    public String listAddressAjax(Model model) throws DaoException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
//       return objectMapper.writeValueAsString(addressDao.getAll());
        model.addAttribute("addressList", objectMapper.writeValueAsString(addressDao.getAll()));
        return "views/testView";
    }


}
