# شبیه ساز دانشگاه
## مقدمه
این پروژه، یک پروژه شبیه سازی یک دانشگاه، بر اساس مفاهیم اولیه شی‌گرایی است. این پروژه، شامل شی های مختلفی مانند فرد، دانشجو، استاد، درس، درس ارائه شده، رشته و کارنامه است که با استفاده از مجموعه ای از این اشیا و رفتار و متدهای آنها، نمرات و معدل دروس دانشجویان در هر رشته و سال ورودی محاسبه شده و در کارنامه آنها قرار می‌گیرد. در نهایت، کارنامه هر یک خروجی داده می‌شود.

## ساختار پروژه
#### پکیج base
پکیج base شامل کلاس person یا فرد است که اطلاعات فرد مانند نام، کد ملی و... در آن ذخیره می‌شود. افراد در آینده به دانشجویان و اساتید تقسیم خواهند شد.

#### پکیج uni
پکیج uni شامل کلاسهای زیر است:
- کلاس major یا رشته: شامل اطلاعات یک رشته و تعداد دانشجویان در حال تحصیل در آن رشته.
- کلاس student یا دانشجو: شامل اطلاعات یک دانشجو و لیست هایی از مجموعه دانشجویان است. در این کلاس، دانشجویان برحسب سال ورود به دانشگاه تقسیم شده و لیست های مختلفی از آنها برای دسترسی بهتر به وجود آمده است؛ همچنین شماره دانشجویی فرد بر همین اساس انتخاب می‌شود.
- کلاس professor یا استاد: شامل اطلاعات یک استاد.
- کلاس course یا درس: شامل اطلاعات یک درس.
- کلاس presentedCourse یا درس در حال ارائه: شامل اطلاعات یک درس در حال ارائه بر حسب استاد درس و تعداد دانشجویانی که درس را انتخاب کرده اند.
- کلاس Transcript یا کارنامه: محاسبات نهایی و گرفتن خروجی از کارنامه دانشجویان در این کلاس انجام می‌گیرد. معدل دانشجویان نیز محاسبه شده و در نهایت کارنامه ها بر حسب نام و شماره دانشجویی افراد خروجی داده می‌شوند.

  
**کلاس main**: در این کلاس، افراد ورودی داده شده و برحسب رشته، دروس، اساتید و دانشجویان، محاسبات به کلاس های دو پکیج base و uni منتقل می‌شود.
