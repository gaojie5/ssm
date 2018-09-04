package com.itheima.solr;

import com.itheima.solr.pojo.Product;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.junit.Test;

import java.io.IOException;

/**
 * solrJ入门实例
 * @author ：gaojie
 * @date ：Created in 21:13 2018/9/3
 */
public class SolrTest {
    /**
     * 定义SolrServer，用来操作Solr
     */
    private SolrServer solrServer = new HttpSolrServer("http://localhost:8088/solr/collection1");

    @Test
    public void saveOrUpdate() throws IOException, SolrServerException {
        Product product = new Product();
        product.setPid("8000");
        product.setName("iphone8");
        product.setCatalogName("手机");
        product.setPrice(8000);
        product.setDescription("苹果手机");
        product.setPicture("1.jpg");
        solrServer.addBean(product);
        //提交事务
        solrServer.commit();
    }
}
