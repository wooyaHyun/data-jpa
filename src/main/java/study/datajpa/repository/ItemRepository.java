package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Item;

/**
 * packageName : study.datajpa.repository
 * fileName : ItemRepository
 * author : SHW
 * date : 2022-10-12
 * description :
 * ===========================================================
 * DATE      AUTHOR      NOTE
 * -----------------------------------------------------------
 * 2022-10-12   SHW     최초 생성
 */

public interface ItemRepository extends JpaRepository<Item, Long> {


}
