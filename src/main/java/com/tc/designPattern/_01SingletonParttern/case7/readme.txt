单元素的枚举类型已经成为实现Singleton的最佳方法：
&Java的枚举类型实质上是功能齐全的类，因此可以有自己的属性和方法。
&Java枚举类型的基本思想是通过公有的静态final域为每个枚举常量导出实例的类。
&从某个角度讲，枚举是单例的泛型化，本质上是单元素的枚举。

使用枚举来实现单例控制会更加简洁，而且无偿地提供了序列号的机制，并由JVM从根
本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。