CREATE TABLE `order`
(
    `id`            bigint unsigned NOT NULL AUTO_INCREMENT,
    `tanggal_order` datetime        NOT NULL,
    `id_pelanggan`  bigint unsigned DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb3
  COLLATE = utf8mb3_unicode_ci;

CREATE TABLE `order_line`
(
    `id`        bigint unsigned NOT NULL AUTO_INCREMENT,
    `id_order`  bigint unsigned NOT NULL,
    `id_produk` bigint unsigned NOT NULL,
    `jumlah`    int             NOT NULL,
    `harga`     decimal(10, 2)  NOT NULL DEFAULT '0.00',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb3
  COLLATE = utf8mb3_unicode_ci;

CREATE TABLE `pelanggan`
(
    `id`     bigint unsigned                        NOT NULL AUTO_INCREMENT,
    `nama`   varchar(50) COLLATE utf8mb3_unicode_ci NOT NULL,
    `alamat` varchar(255) COLLATE utf8mb3_unicode_ci DEFAULT NULL,
    `email`  varchar(50) COLLATE utf8mb3_unicode_ci NOT NULL,
    `telpon` varchar(30) COLLATE utf8mb3_unicode_ci NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1001
  DEFAULT CHARSET = utf8mb3
  COLLATE = utf8mb3_unicode_ci;

CREATE TABLE `produk`
(
    `id`          bigint unsigned                         NOT NULL AUTO_INCREMENT,
    `nama_produk` varchar(100) COLLATE utf8mb3_unicode_ci NOT NULL,
    `harga`       int                                     NOT NULL,
    `stok`        int                                     NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1001
  DEFAULT CHARSET = utf8mb3
  COLLATE = utf8mb3_unicode_ci;