package cholog;

import java.util.List;

public interface CustomerRepository {

    // 성으로 검색
    List<Customer> findByLastName(String lastName);

    // 성으로 검색하되, 대소문자를 무시
    List<Customer> findByLastNameIgnoreCase(String lastName);

    // 성으로 정렬하여 검색
    List<Customer> findByLastNameOrderByFirstNameDesc(String lastName);

}
