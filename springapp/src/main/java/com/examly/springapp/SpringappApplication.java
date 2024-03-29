package com.examly.springapp;

import com.examly.springapp.model.CartModel;
import com.examly.springapp.model.ProductModel;
import com.examly.springapp.model.UserModel;
import com.examly.springapp.service.ProductService;
import com.examly.springapp.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@SpringBootApplication(scanBasePackages = { "com.examly.springapp.**", "com.examly.springapp.service.**",
        "com.examly.springapp.controller.**" })
@EnableJpaRepositories(basePackages = "com.examly.springapp.repository")
@EnableAspectJAutoProxy
@EnableAsync
public class SpringappApplication {

    @Value("${crypto.key}")
    private static String key;

    public static void main(String[] args) {
        SpringApplication.run(SpringappApplication.class, args);
        System.out.println("To login to admin account use these credentials:\nEmail: admin@gmail.com\nPassword: admin");
    }

    @Bean
    CommandLineRunner run(@Autowired SignupService signupService, @Autowired ProductService productService) {
        return args -> {

            CartModel cartModel = new CartModel("0", "Admin Cart", "0", "0.0");
            signupService.saveUser(new UserModel("0", "admin@gmail.com", "admin", "admin", "9999999999", true, "admin",
                    cartModel, null, false, ""));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/kuef2q80/book/t/i/h/sapiens-original-imag7jg9eyhfya9h.jpeg?q=100",
                    "Sapiens", "319",
                    "Sapiens:A Brief History of Humankind is an insight into the ancient history of mankind. According to the author, human history has been shaped by three major revolutions namely, ‘The Cognitive Revolution’, ‘ The Agricultural Revolution’ and ‘The Scientific Revolution’. He feels that mankind has been empowered to create and connect around ideas that do not have a physical existence. Read this book to know more about what the author thinks on the same. Yuval Noah Harari is an author known for his bestsellers such as Homo Deus: A Brief History of Tomorrow, 21 Lessons for the 21st Century and Sapiens: A Brief History of Humankind.",
                    "98"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/kjkbv680/book/7/6/8/forgotten-kashmir-the-other-side-of-the-line-of-control-original-imafz44gzcefchcf.jpeg?q=100",
                    "Forgotten Kashmir", "442",
                    "Forgotten Kashmir examines the evolution of Pakistan-Occupied Kashmir (POK) over the past seven decades. It includes major milestones like the 'tribal' invasion in 1947-48, the Sudhan revolt in the 1950s, the Ayub era, the Simla Agreement, the adoption of an 'Interim Constitution of 1974' and the China-Pakistan Economic Corridor (CPEC). It is not simply a historical account but one that analyses the events in POK against the background of developments in Pakistan's polity to better understand Pakistan's motivations for its policies in the region. The book delves into contentious issues such as the right of self-determination.",
                    "45"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/kufuikw0/book/z/z/8/becoming-original-imag7jnzvj5yhfwy.jpeg?q=100",
                    "Becoming", "628",
                    "Becoming is a powerful, inspiring, and intimate memoir of Michelle Obama, the former First Lady of the United States. She is one of the most iconic women at present, and she is known for being an influential advocate of women’s rights. Her strong and graceful presence at the White House made her one of the most identifiable global figures. This book covers her childhood in Chicago, her journey through the early years, and becoming the first African American First Lady of the United States. Michelle LeVaughn Robinson Obama, popularly known as Michelle Obama, is more than just the first African-American First Lady. She is a lawyer, a university administrator and, most importantly, a writer.",
                    "121"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/jy90eq80/book/5/0/4/the-anarchy-original-imafgjyhxpyshbch.jpeg?q=100",
                    "The Anarchy", "420",
                    "Dalrymple is a superb historian with a visceral understanding of India . A book of beauty' - Gerard DeGroot, The TimesIn August 1765 the East India Company defeated the young Mughal emperor and forced him to establish in his richest provinces a new administration run by English merchants who collected taxes through means of a ruthless private army - what we would now call an act of involuntary privatisation.The East India Company's founding charter authorised it to 'wage war' and it had always used violence to gain its ends. But the creation of this new government marked the moment that the East India Company.",
                    "23"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/kt0enww0/book/o/u/9/india-s-most-fearless-original-imag6gg2ycyejuhe.jpeg?q=100",
                    "India's Most Fearless", "173",
                    "The Army major who led the legendary September 2016 surgical strikes on terror launch pads across the LoC; a soldier who killed 11 terrorists in 10 days; a Navy officer who sailed into a treacherous port to rescue hundreds from an exploding war; a bleeding Air Force pilot who found himself flying a jet that had become a screaming fireball . . . Their own accounts, or of those who were with them in their final moments. India's Most Fearless covers fourteen true stories of extraordinary courage and fearlessness, providing a glimpse into the kind of heroism our soldiers display in unthinkably hostile conditions and under grave provocation.",
                    "21"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/k6i7zww0/book/8/3/2/death-an-inside-story-original-imafnzm3raf8cza8.jpeg?q=100",
                    "Death; An Inside Story", "162",
                    "Death is a taboo in most societies in the world. But what if we have got this completely wrong? What if death was not the catastrophe it is made out to be but an essential aspect of life, rife with spiritual possibilities for transcendence? For the first time, someone is saying just that. In this unique treatise-like exposition, Sadhguru dwells extensively upon his inner experience as he expounds on the more profound aspects of death that are rarely spoken about. From a practical standpoint, he elaborates on what preparations one can make for one's death, how best we can assist someone who is dying and how we can continue to support their journey even after death.",
                    "334"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/kufuikw0/book/x/s/w/atomic-habits-original-imag7kbzg2fu8rjv.jpeg?q=100",
                    "Atomic Habits", "450",
                    "THE PHENOMENAL INTERNATIONAL BESTSELLER: 1 MILLION COPIES SOLD Transform your life with tiny changes in behaviour, starting now. People think that when you want to change your life, you need to think big. But world-renowned habits expert James Clear has discovered another way. He knows that real change comes from the compound effect of hundreds of small decisions: doing two push-ups a day, waking up five minutes early, or holding a single short phone call. He calls them atomic habits. In this ground-breaking book, Clears reveals exactly how these minuscule changes can grow into such life-altering outcomes. He uncovers a handful of simple life hacks (the forgotten art of Habit Stacking.",
                    "43"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/kmkxbww0/book/8/q/g/the-intelligent-investor-english-paperback-graham-benjamin-original-imagfg7tc2wfjkkx.jpeg?q=100",
                    "The Intelligent Investor", "430",
                    "First published in the year 1949, The Intelligent Investor, is considered the Bible for the stock market that contains strategies and wisdom to achieve your financial goals. This is the revised edition of the original book that contains updated commentary by Jason Zweig, a famous financial journalist. This revised edition incorporates the recent market trends and how to make money in the highly vulnerable stock market. British-born American economist, investor, and professor, Benjamin Graham, is known as the ‘father of value investing’ which has been discussed in detail in his two books Security Analysis and The Intelligent Investor.",
                    "19"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/jpr86fk0/book/6/9/2/1984-original-imafbwqan3hyjz8y.jpeg?q=100",
                    "1984", "87",
                    "George Orwell in his book 1984 talks about the future. Written in 1948, Orwell gives us a haunting vision of the future which makes certainly seems true now. Orwell in his book 1984, which was written in 1948 talks about the society and its people will be controlled by the Big Brother. Furthermore, in his book stresses on points like invasion of privacy. Adding to this, personal freedom is lost and rebellion is suppressed. George Orwell was an English author and journalist. He is known for basing his stories, novels and poets on political situations. Orwell authored books like Burmese Days, A Clergyman's Daughter and Keep the Aspidistra Flying.",
                    "2"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/ksgehzk0/book/o/y/i/believe-original-imag6ffsz2phg4mh.jpeg?q=100",
                    "Belive", "190",
                    "Believe, Sachin Tendulkar told him - and he took it to heart, getting the word etched on his arm as a tattoo. In this book, Suresh Raina takes us through the challenges he faced as a young cricketer. He was bullied in school and at cricket camps, but he always punched above his weight, overcoming every adversity life threw at him and never giving up. This is the story of the lessons he learnt and the friendships he built. Peppered with invaluable insights - about the game and about life - that Raina acquired from senior colleagues like M.S. Dhoni, Rahul Dravid, Anil Kumble, Sachin Tendulkar and Sourav Ganguly, among others, this book will make you believe in the power of hard work, love, luck, hope and camaraderie.",
                    "56"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/khuvxjk0-0/book/9/c/w/a-thousand-splendid-suns-original-imafxrtdgczvuh2p.jpeg?q=100",
                    "A Thousand Splendid Suns", "275",
                    "This book tells us a breathtaking story of the unstable events that happened in Afghanistan over the last thirty years - from the Soviet invasion to the reign of the Taliban and post-Taliban rebuilding. It recounts a tale of two generations of characters who are brought together by the dire consequences of war where their personal lives are entangled in the history playing out around them.",
                    "453"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/kqidx8w0/book/n/b/u/world-s-greatest-short-stories-original-imag4hp5wnvxfqt7.jpeg?q=100",
                    "World's Greatest Short Stories", "429",
                    "An exquisitely designed leather-bound edition compiling some of the classic short stories produced around the world between the late eighteenth and the early twentieth century, this book comes with a Ribbon bookmark, gilded edges and beautiful endpapers. Ideal to be read and treasured, it makes for a perfect addition to any library. Beginning with washington irving's masterpiece the legend of the sleepy hollow, it includes the realistic stories of pushkin and chekhov, the gothic spine-chillers of edgar allan poe White Nights by fyodor dostoevsky, tolstoy's most celebrated story.",
                    "325"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/kt7jv680/book/s/q/c/whisper-to-me-your-lies-original-imag6hmyfgnrfxxq.jpeg?q=100",
                    "Whisper to Me Your Lies", "159",
                    " Ekantika Pakrashi has just lost the love of her life. Preliminary reports suggest it was no accident. Her boyfriend was murdered in cold blood and the modus operandi resembles that of India's most notorious serial killer of the 1990s: the Cellotape Killer. He was never caught, and if this indeed was him, then he had resurfaced after twenty-one years. Ekantika swears to find the killer and get an emotional closure, but what she doesn't know is that in the process she may end up wounding herself irreversibly. Follow this exciting chase as the dark alley turns out to be a twisted labyrinth and it seems the killer is actually coming for.",
                    "24"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/612/612/jt7jhjk0/book/6/0/7/wake-up-life-is-calling-original-imafehzjxbac5hsz.jpeg?q=100",
                    "Wake Up, Life is Calling", "97", "Wake Up, Life is Calling", "14"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/416/416/ktszgy80/book/1/n/r/400-days-original-imag72hyyxzy4hfx.jpeg?q=100",
                    "400 Days ", "156",
                    " Someone approaches Keshav with a case that the police consider a hopeless one. Will he be able to crack it with his best friend, Saurabh? Keshav is desperately trying to focus on his IPS exams when a case comes to him. It is as distracting as Alia, the woman who tells him that her daughter has been missing for nine months. The police consider it a cold case, as do her in-laws and husband, but Alia refuses to give up-she is determined to find her daughter. As Keshav-with Saurabh's help-tries to crack what happened all that time ago, he finds himself increasingly drawn to Alia, and her younger daughter. Another unputdownable thriller from India's highest-selling author.",
                    "256"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/416/416/kqidx8w0/book/o/c/6/one-life-to-ride-original-imag4g9ztmfbcxkf.jpeg?q=100",
                    "One Life to Ride ", "199",
                    "Travelling across India on a motorcycle is an intimate way to get acquainted with its myriad cultures, each with their unique beliefs and lifestyle. One Life to Ride takes you across the hot and dusty plains of India to the highest motorable road in the world—the fabled Khardung-La in Ladakh. Along the way you’ll meet Sufi saints, fake fakirs, and homesick soldiers. You’ll come away feeling exhilarated, entertained, and yes, also exhausted by the physical arduousness of the motorcycle ride. Witty, reflective, and honest, One Life to Ride is a daring, real-life adventure guaranteed to keep you turning the pages.",
                    "118"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/416/416/k6i7zww0/book/8/3/2/death-an-inside-story-original-imafnzm3raf8cza8.jpeg?q=100",
                    "Death; An Inside Story", "162",
                    "Death is a taboo in most societies in the world. But what if we have got this completely wrong? What if death was not the catastrophe it is made out to be but an essential aspect of life, rife with spiritual possibilities for transcendence? For the first time, someone is saying just that. In this unique treatise-like exposition, Sadhguru dwells extensively upon his inner experience as he expounds on the more profound aspects of death that are rarely spoken about. From a practical standpoint, he elaborates on what preparations one can make for one's death, how best we can assist someone who is dying and how we can continue to support their journey even after death.",
                    "68"));

            productService.productSave(new ProductModel("",
                    "https://rukminim1.flixcart.com/image/416/416/kij6f0w0-0/book/b/d/e/susegad-original-imafyarfvwmrqej8.jpeg?q=100",
                    "Susegad", "253",
                    "'Susegad' is a Konkani word that has no exact translation in English. Goans use it to convey the sense of contentment, fulfilment and relaxation that everyone associates with Goa and its culture. Clyde D'Souza, bestselling author and proud Goan, shows us the wonderful, unique elements that help Goans achieve susegad, and what you can do to add a pinch of this magic to your life, no matter where you live. As Clyde takes us on a journey through Goa's beautiful beaches, lush greenery, exquisite cuisine, mix of Portuguese and Konkani culture, its history, festivals, music and architecture, you'll learn what makes Goans tick and how they've created habits and routines that lend happiness and calm to their lives.",
                    "39"));

        };
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
