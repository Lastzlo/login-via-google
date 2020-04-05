package ua.kiev.prog.oauth2.loginviagoogle.services;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import ua.kiev.prog.oauth2.loginviagoogle.dto.AccountDTO;
import ua.kiev.prog.oauth2.loginviagoogle.dto.ProductDTO;
import ua.kiev.prog.oauth2.loginviagoogle.dto.TaskDTO;
import ua.kiev.prog.oauth2.loginviagoogle.dto.TaskToNotifyDTO;

import java.util.Date;
import java.util.List;

public interface GeneralService {
    void addAccount(AccountDTO accountDTO, List<TaskDTO> tasks);
    void addTask(String email, TaskDTO taskDTO);
    void addProduct(ProductDTO productDTO);
    List<ProductDTO> getProducts(String brendId, Pageable pageable);
    /*List<ProductDTO> getAllProducts( Pageable pageable);*/

    List<TaskDTO> getTasks(String email, Pageable pageable);
    List<TaskToNotifyDTO> getTasksToNotify(Date now);
    Long count(String email);
    void delete(List<Long> idList);
}
