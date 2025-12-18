package com.example.demo.ch62.repository;
import com.example.demo.ch62.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface AuthorRepository extends JpaRepository<Author, Integer>{
    Author findAuthorById(int id);
    /**
	 * 根据文章标题包含的内容，查询作者（关联查询）
	 * 相当于JPQL语句：select a from Author a  inner join  a.articleList t where t.title like %?1%
	 */
	public Author findByArticleList_titleContaining(String title);
	/**
	 * 根据文章标题包含的内容，查询作者（关联查询）
	 */
	@Query("select a from Author a  inner join  a.articleList t where t.title like %?1%" )
	public Author findAuthorByArticleListtitleContaining(String title);
}
