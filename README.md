# gmsvisionnativecrash1
Crash in gms vision when try to detect face on Android 4.4.4 and below, with image height not multiple 2

1. push images (img_1.jpg and img_2.jpg) from this project on device on sdcard, e.g:  
`adb push img_1.jpg /sdcard/img_1.jpg`  
`adb push img_2.jpg /sdcard/img_2.jpg`  
2. build and install app.  
3. press button `detect crash`  

Crash log:  
```
A/libc: Fatal signal 11 (SIGSEGV) at 0xd5dfdde9 (code=1), thread 26906 (pool-1-thread-1)
I/DEBUG: *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
I/DEBUG: Build fingerprint: 'Verizon/coreprimeltevzw/coreprimeltevzw:4.4.4/KTU84P/G360VVRU2AOF2:user/release-keys'
I/DEBUG: Revision: '7'
I/DEBUG: pid: 26829, tid: 26906, name: pool-1-thread-1  >>> com.looksery.myapplication <<<
I/DEBUG: signal 11 (SIGSEGV), code 1 (SEGV_MAPERR), fault addr d5dfdde9
I/DEBUG:     r0 40040000  r1 9c9cccda  r2 d0c43b78  r3 63c281e0
I/DEBUG:     r4 63c200f0  r5 2321202d  r6 d5dfdddd  r7 63c200f8
I/DEBUG:     r8 00000000  r9 00000500  sl 00000287  fp 63c200f8
I/DEBUG:     ip 63017f08  sp 61104930  lr 4005649f  pc 400566f8  cpsr a00b0030
I/DEBUG:     d0  935e2e272a2e4179  d1  5c676a60492b1e72
I/DEBUG:     d2  2220202022212173  d3  493e454c4f5b5974
I/DEBUG:     d4  6b44327365313047  d5  66646867676b7272
I/DEBUG:     d6  dadcdacdc3be8f71  d7  70899a9da1abcfdb
I/DEBUG:     d8  3de978d541225604  d9  0000000000000076
I/DEBUG:     d10 0000000000000000  d11 0000000000000000
I/DEBUG:     d12 0000000000000000  d13 0000000000000000
I/DEBUG:     d14 0000000000000000  d15 0000000000000000
I/DEBUG:     d16 9797989899999a9a  d17 12f112f913061319
I/DEBUG:     d18 9797979798989898  d19 12f012f212f712fd
I/DEBUG:     d20 006a006b0071006b  d21 006d006c006c006f
I/DEBUG:     d22 fffab66efffae27b  d23 fff974d7fffa2ba9
I/DEBUG:     d24 00970098009e0098  d25 00a0009b00970099
I/DEBUG:     d26 00080fcd00080fcd  d27 000976b90008c343
I/DEBUG:     d28 00530054005c0058  d29 005a005800590059
I/DEBUG:     d30 fff87807fff8069e  d31 fff8069efff8069e
I/DEBUG:     scr 68000012
I/DEBUG: backtrace:
I/DEBUG:     #00  pc 000116f8  /system/lib/libc.so (dlfree+651)
I/DEBUG:     #01  pc 0000ddb3  /system/lib/libc.so (free+10)
I/DEBUG:     #02  pc 000dd64f  /data/data/com.google.android.gms/files/com.google.android.gms.vision/face/libs/armeabi-v7a/libmobile_vision_face.so
I/DEBUG:     #03  pc 000dd7ed  /data/data/com.google.android.gms/files/com.google.android.gms.vision/face/libs/armeabi-v7a/libmobile_vision_face.so
I/DEBUG:     #04  pc 000de549  /data/data/com.google.android.gms/files/com.google.android.gms.vision/face/libs/armeabi-v7a/libmobile_vision_face.so
I/DEBUG:     #05  pc 0002060c  /system/lib/libdvm.so (dvmPlatformInvoke+112)
I/DEBUG:     #06  pc 000512ef  /system/lib/libdvm.so (dvmCallJNIMethod(unsigned int const*, JValue*, Method const*, Thread*)+398)
I/DEBUG:     #07  pc 00029aa0  /system/lib/libdvm.so
I/DEBUG:     #08  pc 00030f84  /system/lib/libdvm.so (dvmMterpStd(Thread*)+76)
I/DEBUG:     #09  pc 0002e61c  /system/lib/libdvm.so (dvmInterpret(Thread*, Method const*, JValue*)+184)
I/DEBUG:     #10  pc 00063751  /system/lib/libdvm.so (dvmCallMethodV(Thread*, Method const*, Object*, bool, JValue*, std::__va_list)+336)
I/DEBUG:     #11  pc 00063775  /system/lib/libdvm.so (dvmCallMethod(Thread*, Method const*, Object*, JValue*, ...)+20)
I/DEBUG:     #12  pc 00058453  /system/lib/libdvm.so
I/DEBUG:     #13  pc 0000d318  /system/lib/libc.so (__thread_entry+72)
I/DEBUG:     #14  pc 0000d4b0  /system/lib/libc.so (pthread_create+240)
I/DEBUG: stack:
I/DEBUG:          611048f0  00000002  
I/DEBUG:          611048f4  0000050b  
I/DEBUG:          611048f8  00000064  
I/DEBUG:          611048fc  00000002  
I/DEBUG:          61104900  000080e5  
I/DEBUG:          61104904  61104abc  [stack:26906]
I/DEBUG:          61104908  000080f0  
I/DEBUG:          6110490c  00000000  
I/DEBUG:          61104910  63f6ebe8  
I/DEBUG:          61104914  400560b3  /system/lib/libc.so (dlmalloc+4254)
I/DEBUG:          61104918  63c200f0  
I/DEBUG:          6110491c  63c200f8  
I/DEBUG:          61104920  63c200f8  
I/DEBUG:          61104924  63c200f8  
I/DEBUG:          61104928  00000000  
I/DEBUG:          6110492c  4005649f  /system/lib/libc.so (dlfree+50)
I/DEBUG:     #00  61104930  4008f000  /system/lib/libc.so
I/DEBUG:          61104934  62efcc41  /data/data/com.google.android.gms/files/com.google.android.gms.vision/face/libs/armeabi-v7a/libmobile_vision_face.so
I/DEBUG:          61104938  63c200f8  
I/DEBUG:          6110493c  63c200f8  
I/DEBUG:          61104940  63d23ef8  
I/DEBUG:          61104944  40052db5  /system/lib/libc.so (free+12)
I/DEBUG:     #01  61104948  631fc560  
I/DEBUG:          6110494c  62fa5651  /data/data/com.google.android.gms/files/com.google.android.gms.vision/face/libs/armeabi-v7a/libmobile_vision_face.so
I/DEBUG:     #02  61104950  000080e5  
I/DEBUG:          61104954  63c200f8  
I/DEBUG:          61104958  62efcc41  /data/data/com.google.android.gms/files/com.google.android.gms.vision/face/libs/armeabi-v7a/libmobile_vision_face.so
I/DEBUG:          6110495c  62ef10dd  /data/data/com.google.android.gms/files/com.google.android.gms.vision/face/libs/armeabi-v7a/libmobile_vision_face.so
I/DEBUG:          61104960  63015830  /data/data/com.google.android.gms/files/com.google.android.gms.vision/face/libs/armeabi-v7a/libmobile_vision_face.so
I/DEBUG:          61104964  631fc160  
I/DEBUG:          61104968  631fc1e0  
I/DEBUG:          6110496c  63d23eb0  
I/DEBUG:          61104970  63e81fd0  
I/DEBUG:          61104974  416767ec  /dev/ashmem/dalvik-zygote (deleted)
I/DEBUG:          61104978  416767e8  /dev/ashmem/dalvik-zygote (deleted)
I/DEBUG:          6110497c  00000280  
I/DEBUG:          61104980  00000000  
I/DEBUG:          61104984  61104abc  [stack:26906]
I/DEBUG:          61104988  0000050f  
I/DEBUG:          6110498c  421a4830  /dev/ashmem/dalvik-heap (deleted)
I/DEBUG:          ........  ........
I/DEBUG: memory near r0:
I/DEBUG:     4003ffe0 4003fed8 401dcec4 4003feb8 4003fc70  
I/DEBUG:     4003fff0 00000001 401db000 00000100 00000000  
I/DEBUG:     40040000 00000000 0000001b 4008f0e0 4008f0e0  
I/DEBUG:     40040010 40054331 40054aa9 40054341 0000001b  
I/DEBUG:     40040020 00000011 00000001 00000000 00000000  
I/DEBUG:     40040030 00000000 0000001b 0000001a 00000002  
I/DEBUG:     40040040 00000000 00000000 00000000 0000001b  
I/DEBUG:     40040050 400e3a30 40040078 00000002 00000000  
I/DEBUG:     40040060 00000008 0000003b 00000001 00000020  
I/DEBUG:     40040070 00000000 00000000 400a6555 00000000  
I/DEBUG:     40040080 4018c831 ffffd8f0 00000000 00000000  
I/DEBUG:     40040090 00000000 00000000 00000000 0000002b  
I/DEBUG:     400400a0 00000001 0000000e 00000000 00000000  
I/DEBUG:     400400b0 00700061 006f0070 00730070 00000000  
I/DEBUG:     400400c0 00000000 0000006b 00000001 00000052  
I/DEBUG:     400400d0 00000000 00000000 006f0063 002e006d  
I/DEBUG: memory near r1:
I/DEBUG:     9c9cccb8 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9cccc8 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9cccd8 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccce8 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9cccf8 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd08 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd18 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd28 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd38 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd48 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd58 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd68 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd78 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd88 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccd98 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     9c9ccda8 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG: memory near r3:
I/DEBUG:     63c281c0 1f1f1b60 21242221 492b1e21 5c676a60  
I/DEBUG:     63c281d0 2a2e4151 935e2e27 74737279 69666775  
I/DEBUG:     63c281e0 6e646964 d0c3ba89 d5dfdddd 9c9cccda  
I/DEBUG:     63c281f0 77917195 1f241e07 2321202d 5d522c1e  
I/DEBUG:     63c28200 47616061 2b2c2b5c b0875030 79757677  
I/DEBUG:     63c28210 c26ba084 4106c59c 41dfe336 42809126  
I/DEBUG:     63c28220 c211bcc0 4106e1e8 bd5e8000 c21b7dfe  
I/DEBUG:     63c28230 c21f545a 417cc9c6 42797276 4328a374  
I/DEBUG:     63c28240 c2671e18 420ed660 43d3ff5d 43f1a656  
I/DEBUG:     63c28250 431b2f18 c29aaf00 c344cf38 432f7ff0  
I/DEBUG:     63c28260 42cc0030 4298f3f0 41006200 c3b1f918  
I/DEBUG:     63c28270 c20d1ca0 c36b2580 450a7032 00000000  
I/DEBUG:     63c28280 00000000 00000000 00000000 41730800  
I/DEBUG:     63c28290 c28007d0 c2626140 4316e6a0 c2b29ea0  
I/DEBUG:     63c282a0 c2779e00 c36c7678 c4387fa6 c345358a  
I/DEBUG:     63c282b0 c26ba084 4106c59c 41dfe336 42809126  
I/DEBUG: memory near r4:
I/DEBUG:     63c200d0 00000010 00000013 00000001 62ef6c31  
I/DEBUG:     63c200e0 000000e0 00000013 00000001 62ef6c31  
I/DEBUG:     63c200f0 00000010 000080f3 fefffaff fffffffe  
I/DEBUG:     63c20100 fffffcff ffffffff fafcfffe fffeffff  
I/DEBUG:     63c20110 fcffffff ffffffff ffffffff ffffffff  
I/DEBUG:     63c20120 ffffffff ffffffff ffffffff fbfbfcfd  
I/DEBUG:     63c20130 fbfbfdfd fcfdfcfc fcfdfcfc fcfbfcfb  
I/DEBUG:     63c20140 fdfcfcfc fcfcfdfd fcfcfdfc fcfcfcfc  
I/DEBUG:     63c20150 fefcfcfc fefefefe ffffffff fcfcffff  
I/DEBUG:     63c20160 f2f9f6f6 f9f8f9f3 f9fafcfa eff9fafa  
I/DEBUG:     63c20170 f9faf9f5 f9f9faf9 f8f9f6f4 faf9fbee  
I/DEBUG:     63c20180 fafaf9fa fefdf8fa fffefefe ffffffff  
I/DEBUG:     63c20190 d5fbfbff d2cfe2e1 d1d6d3d8 d9dae0f5  
I/DEBUG:     63c201a0 d5d7e4d8 d5ead3d9 cfd0d9d6 d6e9dad6  
I/DEBUG:     63c201b0 d4f0d6d6 d9d8d6d2 fdfdfbe0 fefefefe  
I/DEBUG:     63c201c0 fffefefe dbe3f8ff dfdce5ea e8ddd8d0  
I/DEBUG: memory near r5:
I/DEBUG:     2321200c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     2321201c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     2321202c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     2321203c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     2321204c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     2321205c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     2321206c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     2321207c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     2321208c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     2321209c ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     232120ac ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     232120bc ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     232120cc ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     232120dc ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     232120ec ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     232120fc ffffffff ffffffff ffffffff ffffffff  
I/DEBUG: memory near r7:
I/DEBUG:     63c200d8 00000001 62ef6c31 000000e0 00000013  
I/DEBUG:     63c200e8 00000001 62ef6c31 00000010 000080f3  
I/DEBUG:     63c200f8 fefffaff fffffffe fffffcff ffffffff  
I/DEBUG:     63c20108 fafcfffe fffeffff fcffffff ffffffff  
I/DEBUG:     63c20118 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     63c20128 ffffffff fbfbfcfd fbfbfdfd fcfdfcfc  
I/DEBUG:     63c20138 fcfdfcfc fcfbfcfb fdfcfcfc fcfcfdfd  
I/DEBUG:     63c20148 fcfcfdfc fcfcfcfc fefcfcfc fefefefe  
I/DEBUG:     63c20158 ffffffff fcfcffff f2f9f6f6 f9f8f9f3  
I/DEBUG:     63c20168 f9fafcfa eff9fafa f9faf9f5 f9f9faf9  
I/DEBUG:     63c20178 f8f9f6f4 faf9fbee fafaf9fa fefdf8fa  
I/DEBUG:     63c20188 fffefefe ffffffff d5fbfbff d2cfe2e1  
I/DEBUG:     63c20198 d1d6d3d8 d9dae0f5 d5d7e4d8 d5ead3d9  
I/DEBUG:     63c201a8 cfd0d9d6 d6e9dad6 d4f0d6d6 d9d8d6d2  
I/DEBUG:     63c201b8 fdfdfbe0 fefefefe fffefefe dbe3f8ff  
I/DEBUG:     63c201c8 dfdce5ea e8ddd8d0 dedfe1ea dde0dfe5  
I/DEBUG: memory near fp:
I/DEBUG:     63c200d8 00000001 62ef6c31 000000e0 00000013  
I/DEBUG:     63c200e8 00000001 62ef6c31 00000010 000080f3  
I/DEBUG:     63c200f8 fefffaff fffffffe fffffcff ffffffff  
I/DEBUG:     63c20108 fafcfffe fffeffff fcffffff ffffffff  
I/DEBUG:     63c20118 ffffffff ffffffff ffffffff ffffffff  
I/DEBUG:     63c20128 ffffffff fbfbfcfd fbfbfdfd fcfdfcfc  
I/DEBUG:     63c20138 fcfdfcfc fcfbfcfb fdfcfcfc fcfcfdfd  
I/DEBUG:     63c20148 fcfcfdfc fcfcfcfc fefcfcfc fefefefe  
I/DEBUG:     63c20158 ffffffff fcfcffff f2f9f6f6 f9f8f9f3  
I/DEBUG:     63c20168 f9fafcfa eff9fafa f9faf9f5 f9f9faf9  
I/DEBUG:     63c20178 f8f9f6f4 faf9fbee fafaf9fa fefdf8fa  
I/DEBUG:     63c20188 fffefefe ffffffff d5fbfbff d2cfe2e1  
I/DEBUG:     63c20198 d1d6d3d8 d9dae0f5 d5d7e4d8 d5ead3d9  
I/DEBUG:     63c201a8 cfd0d9d6 d6e9dad6 d4f0d6d6 d9d8d6d2  
I/DEBUG:     63c201b8 fdfdfbe0 fefefefe fffefefe dbe3f8ff  
I/DEBUG:     63c201c8 dfdce5ea e8ddd8d0 dedfe1ea dde0dfe5  
I/DEBUG: memory near ip:
I/DEBUG:     63017ee8 40067fd5 62fd6a38 62fd2064 4007f7a3  
I/DEBUG:     63017ef8 4005713d 40066db4 4005a2d9 400698bc  
I/DEBUG:     63017f08 40052da9 400baa08 62fd0ee9 40052d95  
I/DEBUG:     63017f18 62fd33a8 62fd231c 400b2931 400bf418  
I/DEBUG:     63017f28 400b79c0 400c6760 400c6600 400bfe68  
I/DEBUG:     63017f38 400c31b0 40053a24 40053b28 62ff8ea0  
I/DEBUG:     63017f48 40054180 40053f98 40053f90 40053f74  
I/DEBUG:     63017f58 40053eb0 400bec20 400b7c80 400b7ff8  
I/DEBUG:     63017f68 400b9f98 62fd1078 400c2508 62fce5f9  
I/DEBUG:     63017f78 40053800 40053f34 400c35a8 400c8f60  
I/DEBUG:     63017f88 62ff8dc4 400bf160 40058171 400523c0  
I/DEBUG:     63017f98 40059b71 40059849 4006add9 400596dd  
I/DEBUG:     63017fa8 4006dd65 40065684 40072f7d 40065d00  
I/DEBUG:     63017fb8 40057ea5 40041d25 400be9f0 62ff8cfc  
I/DEBUG:     63017fc8 400c3058 62fd20c8 62fd20d8 62fd20e8  
I/DEBUG:     63017fd8 62fd1600 62fd1500 62fd1120 62fd3a10  
I/DEBUG: memory near sp:
I/DEBUG:     61104910 63f6ebe8 400560b3 63c200f0 63c200f8  
I/DEBUG:     61104920 63c200f8 63c200f8 00000000 4005649f  
I/DEBUG:     61104930 4008f000 62efcc41 63c200f8 63c200f8  
I/DEBUG:     61104940 63d23ef8 40052db5 631fc560 62fa5651  
I/DEBUG:     61104950 000080e5 63c200f8 62efcc41 62ef10dd  
I/DEBUG:     61104960 63015830 631fc160 631fc1e0 63d23eb0  
I/DEBUG:     61104970 63e81fd0 416767ec 416767e8 00000280  
I/DEBUG:     61104980 00000000 61104abc 0000050f 421a4830  
I/DEBUG:     61104990 2dc00005 63017e84 61104b24 62fa57f1  
I/DEBUG:     611049a0 00000000 643587df 40093394 00000000  
I/DEBUG:     611049b0 41663c34 42123500 21a00009 575f5b58  
I/DEBUG:     611049c0 00000000 611049e4 21a00009 415ec6f1  
I/DEBUG:     611049d0 42123500 415f0417 611049e8 61104a1c  
I/DEBUG:     611049e0 60afad3c 60b76190 00000001 00000000  
I/DEBUG:     611049f0 00000007 415f03ad 60b765e8 61104a98  
I/DEBUG:     61104a00 5ad31934 5ad0bf1f 4166a110 41593d50  
I/DEBUG: code around pc:
I/DEBUG:     400566d8 42986888 8136f040 608d60e9 68d9e063  
I/DEBUG:     400566e8 4299699d 689ed00c 42866900 af39f4ff  
I/DEBUG:     400566f8 429868f0 8129f000 60f1e733 e01b608e  
I/DEBUG:     40056708 f1036959 b9310014 f1036919 b9110010  
I/DEBUG:     40056718 6831e012 694f4630 0614f101 d1f82f00  
I/DEBUG:     40056728 f101690f 2f000610 4e96d1f3 6936447e  
I/DEBUG:     40056738 f4ff42b0 6007af16 d0342d00 489269de  
I/DEBUG:     40056748 0c4cf106 f8504478 42bb702c f840d110  
I/DEBUG:     40056758 b129102c 447e4e8d 42b16936 e700d214  
I/DEBUG:     40056768 68432101 f606fa01 0106ea23 e01a6041  
I/DEBUG:     40056778 42856900 aef5f4ff 42986928 6129bf0c  
I/DEBUG:     40056788 29006169 e00ed1e6 618d6918 42b0b120  
I/DEBUG:     40056798 aee7f4ff 61816108 b123695b f4ff42b3  
I/DEBUG:     400567a8 614baee0 487a6199 0301f042 447850a2  
I/DEBUG:     400567b8 69416063 d108428c e0a86082 0001f021  
I/DEBUG:     400567c8 605850a2 0301f042 08d06063 d818281f  
I/DEBUG: code around lr:
I/DEBUG:     4005647c 447804e8 31bcf8d0 d406079b 54dcf8df  
I/DEBUG:     4005648c 692e447d d20742b4 f500e236 f7fd70e0  
I/DEBUG:     4005649c 2800eac4 bdf8d0f2 1c04f857 0003f001  
I/DEBUG:     400564ac f0002801 f0218229 07c90207 0302eb04  
I/DEBUG:     400564bc 80b1f100 1c08f857 b9701a64 46203110  
I/DEBUG:     400564cc 4631188e e8d8f00f f0402800 f8d5821e  
I/DEBUG:     400564dc 1b8201b0 21b0f8c5 42b4e217 f0c0440a  
I/DEBUG:     400564ec 6968820b f0004284 08cf808c d8272f1f  
I/DEBUG:     400564fc eb0568a0 f10505c7 68e10c28 d0064560  
I/DEBUG:     4005650c f0c042b0 68c5820e f04042a5 4281820a  
I/DEBUG:     4005651c f8dfd10a 2501044c fa054478 6801f707  
I/DEBUG:     4005652c 0507ea21 e0766005 d0064561 f0c042b1  
I/DEBUG:     4005653c 688d81fc f04042a5 60c181f8 e06a6088  
I/DEBUG:     4005654c 69a068e1 d00e42a1 42b568a5 68eed307  
I/DEBUG:     4005655c f00042a6 e00281ed 608d60e9 f8dfe01c  
I/DEBUG:     4005656c 44780404 6961e1df 0514f104 6921b939  
I/DEBUG: memory map around fault addr d5dfdde9:
I/DEBUG:     bee24000-bee45000 rw- [stack]
I/DEBUG:     (no map for address)
I/DEBUG:     ffff0000-ffff1000 r-x [vectors]
```
