package com.example.test;

import com.example.ExternalApi1;
import com.example.MyService1;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest1 {

    @Test
    public void testVerifyInteraction() {
      
        ExternalApi1 mockApi = mock(ExternalApi1.class);

        MyService1 service = new MyService1(mockApi);
        service.fetchData();

        verify(mockApi).getData();
    }
}