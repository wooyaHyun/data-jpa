package study.datajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.datajpa.entity.Item;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : study.datajpa.repository
 * fileName : ItemRepositoryTest
 * author : SHW
 * date : 2022-10-12
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-12   SHW     최초 생성
 */

@SpringBootTest
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    void save(){
        Item item = new Item("A");
        itemRepository.save(item);
    }

}