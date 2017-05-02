/**
 * Created by Jacob_MACMini on 02/05/2017.
 */
package com.mypage.HomeTask_Amazon;
import org.junit.Test;

public class Amazon_Task_Test {
    @Test
    public void searchAmazon(){
        String myLink = "http://amazon.com";
        Amazon_Task.NavigateToPage(myLink);
        Amazon_Task.SearchProduct();
        Amazon_Task.SortSearchResults();
        Amazon_Task.SelectResultItem();
        Amazon_Task.FindText();
    }
}
