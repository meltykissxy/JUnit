# JUnit

只要执行任何一个@Test，顺序必定是：@BeforeEach -> @Test -> @AfterEach
就算@Test失败了，@BeforeEach和@AfterEach也会执行
