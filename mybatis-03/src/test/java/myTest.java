import com.xie.map.BlogMapper;
import com.xie.pojo.Blog;
import com.xie.utils.IDutils;
import com.xie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class myTest {
    @Test
    public void addInitBolg(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("谢仕洲");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBook(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBook(blog);

        sqlSession.close();
    }


    @Test
    public void  getBlogByTitle(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> list1 = mapper.getBlogByTitle("Spring如此简单");
        System.out.println("================================================================================================================");
        List<Blog> list2 = mapper.getBlogByTitle("微服务如此简单");
        /*for (Blog blog : list1) {
            System.out.println(blog);
        }



        for (Blog blog : list2) {
            System.out.println(blog);
        }
*/
        sqlSession.close();
    }
}
